package com.example.wav9.caers;

// категории вопросов


public class Question
{
    // описание вопроса
    private String description;

    // ответы на вопрос
    private Answer[] answers;

    // конструктор
    public Question(String description, Answer[] answers)
    {
        this.description = description;
        this.answers = answers;
    }

    // getter описания
    public String getDescription()
    {
        return description;
    }

    public Answer[] getAnswers()
    {
        return answers;
    }
}
