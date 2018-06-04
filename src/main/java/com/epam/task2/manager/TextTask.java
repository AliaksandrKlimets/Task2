package com.epam.task2.manager;

import com.epam.task2.entity.CompositeEntity;
import com.epam.task2.entity.TextEntity;
import com.epam.task2.parser.ParserLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextTask {
    public CompositeEntity DeleteWordByLength(String content, int length) {
        CompositeEntity text = (CompositeEntity) ParserLogic.parse(content);
        System.out.println(text.getContent());
        for (TextEntity paragraph : text.getChilds()) {
            CompositeEntity parag = (CompositeEntity)paragraph;
            for (TextEntity setnences : parag.getChilds()) {
                CompositeEntity sentence = (CompositeEntity)setnences;
                for (TextEntity word : sentence.getChilds()) {
                    Matcher matcher = Pattern.compile("^[qwrtpsdfghklzxcvbnm]]").matcher(word.getContent());
                    if(word.getContent().length()==length && matcher.find()){
                        sentence.getChilds().remove(word);
                    }
                }
            }
        }
        return text;
    }
}
