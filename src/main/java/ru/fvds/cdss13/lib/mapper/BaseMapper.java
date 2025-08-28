package ru.fvds.cdss13.lib.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.List;

/**
 * Entity  DTO
 * @param <E> - тип Entity
 * @param <D> - тип DTO
 */
@Mapper
public interface BaseMapper<E, D> {

    /**
     * Преобразование Entity в DTO
     */
    D asDto(E entity);

    /**
     * Преобразование DTO в Entity
     */
    E asEntity(D dto);

    /**
     * Обновление Entity из DTO
     */
    @Mapping(target = "id", ignore = true) // ID обычно не обновляем
    void updateEntityFromDto(D dto, @MappingTarget E entity);

    /**
     * Преобразование списка Entity в список DTO
     */
    List<D> toDtoList(List<E> entities);

    /**
     * Преобразование списка DTO в список Entity
     */
    List<E> toEntityList(List<D> dtos);

    /**
     * Маппинг enum по имени (общий метод)
     */
    @Named("mapEnumByName")
    default <T extends Enum<T>, R extends Enum<R>> R mapEnumByName(T source, Class<R> targetType) {
        if (source == null) {
            return null;
        }
        try {
            return Enum.valueOf(targetType, source.name());
        } catch (IllegalArgumentException e) {
            return getDefaultEnumValue(targetType);
        }
    }

    /**
     * Маппинг enum ignore case
     */
    @Named("mapEnumIgnoreCase")
    default <T extends Enum<T>, R extends Enum<R>> R mapEnumIgnoreCase(T source, Class<R> targetType) {
        if (source == null) {
            return null;
        }
        String sourceName = source.name();
        for (R constant : targetType.getEnumConstants()) {
            if (constant.name().equalsIgnoreCase(sourceName)) {
                return constant;
            }
        }
        return getDefaultEnumValue(targetType);
    }

    /**
     * Получение значения по умолчанию для enum
     */
    default <T extends Enum<T>> T getDefaultEnumValue(Class<T> enumClass) {
        T[] constants = enumClass.getEnumConstants();
        return constants.length > 0 ? constants[0] : null;
    }

    /**
     * Enum to String
     */
    @Named("enumToString")
    default String enumToString(Enum<?> enumValue) {
        return enumValue != null ? enumValue.name() : null;
    }

    /**
     * String to Enum
     */
    @Named("stringToEnum")
    default <T extends Enum<T>> T stringToEnum(String value, Class<T> enumClass) {
        if (value == null || value.trim().isEmpty()) {
            return getDefaultEnumValue(enumClass);
        }
        try {
            return Enum.valueOf(enumClass, value.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return getDefaultEnumValue(enumClass);
        }
    }

    /**
     * Boolean to String
     */
    @Named("booleanToString")
    default String booleanToString(Boolean value) {
        return value != null ? value.toString() : null;
    }

    /**
     * String to Boolean
     */
    @Named("stringToBoolean")
    default Boolean stringToBoolean(String value) {
        return value != null ? Boolean.parseBoolean(value) : null;
    }
}

