package com.imooc.diveinspringboot.jl.spring.model;public class TextFile {    private int id;    private String filename;    private byte[] data;    private int parent_id;    public int getId() {        return id;    }    public void setId(int id) {        this.id = id;    }    public String getFilename() {        return filename;    }    public void setFilename(String filename) {        this.filename = filename;    }    public byte[] getData() {        return data;    }    public void setData(byte[] data) {        this.data = data;    }    public int getParent_id() {        return parent_id;    }    public void setParent_id(int parent_id) {        this.parent_id = parent_id;    }}