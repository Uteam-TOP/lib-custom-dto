package ru.fvds.cdss13.lib.mapper;



public interface BaseMapper<Entity,Dto> {

    Entity asEntity(Dto dto);

    Dto asDto(Entity entity);

//    void updateEntityFrom(Dto dto, @MappingTarget Entity entity);


}
