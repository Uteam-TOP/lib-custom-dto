package ru.fvds.cdss13.lib.util;

import ru.fvds.cdss13.lib.dto.EventPrefix;

public final class UtilsLib {

    public static String createTopic(Class<?> dto, EventPrefix prefix){
        return String.format("%s_%s", prefix, dto.getCanonicalName());
    }


}
