package com.epam.task2.entity;

import java.util.List;

public abstract class TextEntity {
    protected  String content;

    public abstract TextEntityType getType();
    public abstract boolean isLeaf();
    public abstract int size();
    public abstract void setType(TextEntityType type);

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
