package com.example.wav9.caers;

public class Answer
{
    // описание ответа
    private String description;

    // категория ответа
    private AnswerCategory answerCategory;

    // конструктор класса
    public Answer(String description, AnswerCategory answerCategory)
    {
        this.description = description;
        this.answerCategory = answerCategory;
    }

    // getter категории
    public AnswerCategory getAnswerCategory()
    {
        return answerCategory;
    }

    // getter описания
    public String getDescription()
    {
        return description;
    }
}
