package com.epam.task2.runner;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.task2.entity.CompositeEntity;
import com.epam.task2.entity.TextEntity;
import com.epam.task2.manager.ManagerBundle;
import com.epam.task2.parser.ParserLogic;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sun.net.TelnetInputStream;

public class Runner {
    public static final Logger logger = Logger.getLogger("com.epam.task2.runner");
    public static void main(String[] args) {
        logger.setResourceBundle(ResourceBundle.getBundle("log4j"));



        String content = "In         our course, we emphasize key aspects of language learning, including list" +
                "ening comprehension, rapid vocabulary expansion, English grammar, common idiomatic expr" +
                "essions, interactive pronunciation and grammar exercises, and live speaking practice. E" +
                "ach week, our hosts discuss current news and American culture at a slow pace that will help you understand.\n" +
                "\n" +
                "On our website, you will find a comprehensive catalog of grammar and expressions l" +
                "essons, from beginning to intermediate English. You don't actually need an extensive " +
                " to start enjoying our program! The transcripts available on our website and mobile app offer optional, contextual translation.";

//        final String REGEX_SENTENCE = "regex.paragraph";
//        ArrayList<String> sentences = new ArrayList<>();
//        String key = ManagerBundle.getProperty(REGEX_SENTENCE);
//        Matcher matcher = Pattern.compile(key).matcher(content);
//
//        while(matcher.find()){
//            sentences.add(matcher.group());
//        }
//            int i=1;
//        for (String sentenceItem : sentences) {
//            System.out.println((i++) + sentenceItem);
//        }
        CompositeEntity text =  (CompositeEntity) ParserLogic.parse(content);
        text.getContent();
    }

}
