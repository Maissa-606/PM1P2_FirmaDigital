package com.example.pm1p2_firmadigital;

public class TablaImagenes
{

    public static final String tablaimagenes = "imagenes";
    public static final String id = "id";
    public static final String imagen = "imagen";
    public static final String nombre = "nombre";
    public static final String CreateTableImagenes = "CREATE TABLE imagenes( id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, imagen BLOB, nombre TEXT)";
    public static final String DropTableImagenes = "DROP TABLE IF EXISTS imagenes";
    public static final String NameDataBase = "DBCurso.db";

}
