package com.ahinardev.literalura.service;


import com.ahinardev.literalura.model.InformacionLibro;

import java.util.List;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

    List<InformacionLibro> obtenerDatos(String json);
}
