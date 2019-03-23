package com.example.wav9.caers;

import java.util.ArrayList;

public class Questions
{
    // число вопросов в тесте
    private final static int QUESTIONS_COUNT = 70;

    // список вопросов
    private static ArrayList<Question> questions;

    // конструктор
    private Questions()
    {

    }

    // getter вопросов
    public static ArrayList<Question> getQuestions()
    {
        if (questions == null)
        {
            questions = new ArrayList<Question>(QUESTIONS_COUNT);
            initQuestions();
        }
        return questions;
    }

    // инициализация вопросов
    private static void initQuestions()
    {
        questions.add(new Question("В компании (на вечеринке) вы:", new Answer[]{new Answer("общаетесь со многими, включая и незнакомцев", AnswerCategory.E), new Answer("общаетесь с немногими – вашими знакомыми", AnswerCategory.I)}));
        questions.add(new Question("Вы человек скорее:", new Answer[]{new Answer("реалистичный, чем склонный теоретизировать", AnswerCategory.S), new Answer("склонный теоретизировать, чем реалистичный", AnswerCategory.N)}));
        questions.add(new Question("Как по-вашему, что хуже:", new Answer[]{new Answer("«витать в обликах»", AnswerCategory.S), new Answer("придерживаться проторенной дорожки", AnswerCategory.N)}));
        questions.add(new Question("Вы более подвержены влиянию;", new Answer[]{new Answer("принципов, законов", AnswerCategory.T), new Answer("эмоции, чувств", AnswerCategory.F)}));
        questions.add(new Question("Вы более склонны:", new Answer[]{new Answer("убеждать", AnswerCategory.T), new Answer("затрагивать чувства", AnswerCategory.F)}));
        questions.add(new Question("Вы предпочитаете работать:", new Answer[]{new Answer("выполняя все точно в срок", AnswerCategory.J), new Answer("не связывая себя определенными сроками", AnswerCategory.P)}));
        questions.add(new Question("Вы склонны делать выбор:", new Answer[]{new Answer("довольно осторожно", AnswerCategory.J), new Answer("внезапно импульсивно", AnswerCategory.P)}));
        questions.add(new Question("В компании (на вечеринке) вы:", new Answer[]{new Answer("остаетесь допоздна, не чувствуя усталости", AnswerCategory.E), new Answer("быстро утомляетесь и предпочитаете пораньше уйти", AnswerCategory.I)}));
        questions.add(new Question("Вас бoлee привлекают:", new Answer[]{new Answer("здравомыслящие люди", AnswerCategory.S), new Answer("люди с богатым воображением", AnswerCategory.N)}));
        questions.add(new Question("Вам интереснее:", new Answer[]{new Answer("то что происходит в действительности", AnswerCategory.S), new Answer("те события которые могут произойти", AnswerCategory.N)}));
        questions.add(new Question("Оценивая поступки людей, вы больше учитываете:", new Answer[]{new Answer("требования закона, чем обстоятельства", AnswerCategory.T), new Answer("обстоятельства, чем требования закона", AnswerCategory.F)}));
        questions.add(new Question("Обращаясь к другим, вы склонны:", new Answer[]{new Answer("соблюдать формальности, этикет", AnswerCategory.T), new Answer("проявлять свои личные, индивидуальные качества", AnswerCategory.F)}));
        questions.add(new Question("Вы человек скорее:", new Answer[]{new Answer("точный, пунктуальный", AnswerCategory.J), new Answer("неторопливый, медленный", AnswerCategory.P)}));
        questions.add(new Question("Вас больше беспокоит необходимость:", new Answer[]{new Answer("оставлять дела незаконченными", AnswerCategory.J), new Answer("непременно доводить дело до конца", AnswerCategory.P)}));
        questions.add(new Question("В кругу знакомых вы, как правило:", new Answer[]{new Answer("в куpce происходящих событий", AnswerCategory.E), new Answer("узнаете о новостях с опозданием", AnswerCategory.I)}));
        questions.add(new Question("Повседневные дела вам нравится делать:", new Answer[]{new Answer("общепринятым способом", AnswerCategory.S), new Answer("своим оригинальным способом", AnswerCategory.N)}));
        questions.add(new Question("Предпочитаю таких писателей, которые:", new Answer[]{new Answer("выражаются буквально, напрямую", AnswerCategory.S), new Answer("пользуются аналогиями, иносказаниями", AnswerCategory.N)}));
        questions.add(new Question("Вас больше привлекает:", new Answer[]{new Answer("стройность мысли", AnswerCategory.T), new Answer("гармония человеческих отношений", AnswerCategory.F)}));
        questions.add(new Question("Вы чувствуете себя увереннее:", new Answer[]{new Answer("в логических умозаключениях", AnswerCategory.T), new Answer("в практических оценках ситуаций", AnswerCategory.F)}));
        questions.add(new Question("Вы предпочитаете, когда дела:", new Answer[]{new Answer("решены и устроены", AnswerCategory.J), new Answer("не решены и не устроены", AnswerCategory.P)}));
        questions.add(new Question("Как по-вашему, вы человек:", new Answer[]{new Answer("серьезный, определенный", AnswerCategory.J), new Answer("беззаботный, беспечный", AnswerCategory.P)}));
        questions.add(new Question("При телефонных разговорах вы:", new Answer[]{new Answer("заранее не продумываете: все, что надо сказать", AnswerCategory.E), new Answer("мысленно \"репетируете\" то, что будет сказано", AnswerCategory.I)}));
        questions.add(new Question("Как вы считаете факты:", new Answer[]{new Answer("важны сами по себе", AnswerCategory.S), new Answer("ecть проявление общих закономерностей", AnswerCategory.N)}));
        questions.add(new Question("Фантазеры, мечтатели:", new Answer[]{new Answer("раздражают вас", AnswerCategory.S), new Answer("довольно симпатичны вам", AnswerCategory.N)}));
        questions.add(new Question("Вы чаще действуете как человек:", new Answer[]{new Answer("хладнокровный", AnswerCategory.T), new Answer("вспыльчивый, горячий", AnswerCategory.F)}));
        questions.add(new Question("Как, по-вашему, хуже быть:", new Answer[]{new Answer("несправедливым", AnswerCategory.T), new Answer("беспощадным", AnswerCategory.F)}));
        questions.add(new Question("Обычно вы предпочитаете действовать:", new Answer[]{new Answer("тщательно оценив возможности", AnswerCategory.J), new Answer("полагаясь на волю случая", AnswerCategory.P)}));
        questions.add(new Question("Вам приятнее:", new Answer[]{new Answer("покупать что-то", AnswerCategory.J), new Answer("иметь возможность купить", AnswerCategory.P)}));
        questions.add(new Question("В компании вы как правило:", new Answer[]{new Answer("первым заводите беседу", AnswerCategory.E), new Answer("ждете, когда с вами заговорят", AnswerCategory.I)}));
        questions.add(new Question("Здравый смысл:", new Answer[]{new Answer("редко ошибается", AnswerCategory.S), new Answer("часто попадает впросак", AnswerCategory.N)}));
        questions.add(new Question("Детям часто не хватает:", new Answer[]{new Answer("практичности", AnswerCategory.S), new Answer("воображения", AnswerCategory.N)}));
        questions.add(new Question("В принятии решений вы руководствуетесь скорее:", new Answer[]{new Answer("принятыми нормами", AnswerCategory.T), new Answer("своими чувствами, ощущениями", AnswerCategory.F)}));
        questions.add(new Question("Вы человек скорее:", new Answer[]{new Answer("твердый, чем мягкий", AnswerCategory.T), new Answer("мягкий, чем твердый", AnswerCategory.F)}));
        questions.add(new Question("Что, по-вашему, больше впечатляет:", new Answer[]{new Answer("умение методично организовывать", AnswerCategory.J), new Answer("умение приспособиться и довольствоваться достигнутым", AnswerCategory.P)}));
        questions.add(new Question("Вы больше цените:", new Answer[]{new Answer("определенность, законченность", AnswerCategory.J), new Answer("открытость, многовариантность", AnswerCategory.P)}));
        questions.add(new Question("Новые и нестандартные отношения с людьми:", new Answer[]{new Answer("стимулируют, придают вам энергии", AnswerCategory.E), new Answer("утомляют", AnswerCategory.I)}));
        questions.add(new Question("Вы чаще действуете как:", new Answer[]{new Answer("человек практического склада", AnswerCategory.S), new Answer("человек оригинальный, необычный", AnswerCategory.N)}));
        questions.add(new Question("Вы более склонны:", new Answer[]{new Answer("находить пользу в отношениях с людьми", AnswerCategory.S), new Answer("понимать мысли и чувства других", AnswerCategory.N)}));
        questions.add(new Question("Что приносит вам больше удовлетворения:", new Answer[]{new Answer("тщательное всестороннее обсуждение спорного вопроса", AnswerCategory.T), new Answer("достижения соглашения по поводу спорного вопроса", AnswerCategory.F)}));
        questions.add(new Question("Вы руководствуетесь более:", new Answer[]{new Answer("рассудком", AnswerCategory.T), new Answer("велениями сердца", AnswerCategory.F)}));
        questions.add(new Question("Вам удобнее выполнять работу:", new Answer[]{new Answer("по предварительной договоренности", AnswerCategory.J), new Answer("которая подвернулась случайно", AnswerCategory.P)}));
        questions.add(new Question("Вы обычно полагаетесь:", new Answer[]{new Answer("на организованность, порядок", AnswerCategory.J), new Answer("на случайность, неожиданность", AnswerCategory.P)}));
        questions.add(new Question("Вы предпочитаете иметь:", new Answer[]{new Answer("много друзей на непродолжительный срок", AnswerCategory.E), new Answer("несколько старых друзей", AnswerCategory.I)}));
        questions.add(new Question("Вы руководствуетесь большей степени:", new Answer[]{new Answer("фактами, обстоятельствами", AnswerCategory.S), new Answer("общим положениями, принципами", AnswerCategory.N)}));
        questions.add(new Question("Вас больше интересуют:", new Answer[]{new Answer("производство и сбыт продукции", AnswerCategory.S), new Answer("проектирование и исследования", AnswerCategory.N)}));
        questions.add(new Question("Что вы скорее сочтете за комплимент:", new Answer[]{new Answer("«Вы очень логичный человек»", AnswerCategory.T), new Answer("«Вы тонко чувствующий человек»", AnswerCategory.F)}));
        questions.add(new Question("Вы более цените в себе:", new Answer[]{new Answer("невозмутимость", AnswerCategory.T), new Answer("увлеченность", AnswerCategory.F)}));
        questions.add(new Question("Вы предпочитаете высказывать:", new Answer[]{new Answer("окончательные и определенные утверждения", AnswerCategory.J), new Answer("предварительные и неоднозначные утверждения", AnswerCategory.P)}));
        questions.add(new Question("Вы лучше чувствуете себя:", new Answer[]{new Answer("после принятия решения", AnswerCategory.J), new Answer("не ограничивая себя решениями", AnswerCategory.P)}));
        questions.add(new Question("Общаясь с незнакомыми вы:", new Answer[]{new Answer("легко завязываете продолжительные беседы", AnswerCategory.E), new Answer("не всегда находите общие темы для разговора", AnswerCategory.I)}));
        questions.add(new Question("Вы больше доверяете:", new Answer[]{new Answer("своему опыту", AnswerCategory.S), new Answer("своим предчувствиям\n", AnswerCategory.N)}));
        questions.add(new Question("Вы чувствуете себя человеком:", new Answer[]{new Answer("более практичным, чем изобретательным", AnswerCategory.S), new Answer("более изобретательным, чем практичным", AnswerCategory.N)}));
        questions.add(new Question("Кто заслуживает больше одобрения:", new Answer[]{new Answer("рассудительный, здравомыслящий человек", AnswerCategory.T), new Answer("человек глубоко переживающий", AnswerCategory.F)}));
        questions.add(new Question("Вы более склонны:", new Answer[]{new Answer("быть прямым и беспристрастным", AnswerCategory.T), new Answer("сочувствовать людям", AnswerCategory.F)}));
        questions.add(new Question("Что по-вашему, предпочтительней:", new Answer[]{new Answer("удостовериться, что все подготовлено и улажено", AnswerCategory.J), new Answer("предоставить событиям идти своим чередом", AnswerCategory.P)}));
        questions.add(new Question("Отношения между людьми должны строиться:", new Answer[]{new Answer("на предварительной взаимной договоренности", AnswerCategory.J), new Answer("в зависимости от обстоятельств", AnswerCategory.P)}));
        questions.add(new Question("Когда звонит телефон, вы:", new Answer[]{new Answer("торопитесь подойти первым", AnswerCategory.E), new Answer("надеетесь, что подойдет кто-нибудь другой", AnswerCategory.I)}));
        questions.add(new Question("Что вы цените в себе больше:", new Answer[]{new Answer("развитое чувство реальности", AnswerCategory.S), new Answer("пылкое воображение", AnswerCategory.N)}));
        questions.add(new Question("Вы больше придаете значения:", new Answer[]{new Answer("тому, что сказано", AnswerCategory.S), new Answer("тому, как сказано", AnswerCategory.N)}));
        questions.add(new Question("Что выглядит большим заблуждением:", new Answer[]{new Answer("излишняя пылкость, горячность", AnswerCategory.T), new Answer("чрезмерная объективность, беспристрастность", AnswerCategory.F)}));
        questions.add(new Question("Вы в основном считаете себя:", new Answer[]{new Answer("трезвым и практичным", AnswerCategory.T), new Answer("сердечным отзывчивым", AnswerCategory.F)}));
        questions.add(new Question("Какие ситуации привлекают вас больше:", new Answer[]{new Answer("регламентированные и упорядоченные", AnswerCategory.J), new Answer("неупорядоченные и нерегламентированные", AnswerCategory.P)}));
        questions.add(new Question("Вы человек скорее:", new Answer[]{new Answer("педантичный, чем капризный", AnswerCategory.J), new Answer("капризный, чем педантичный", AnswerCategory.P)}));
        questions.add(new Question("Вы чаще склонны:", new Answer[]{new Answer("быть открытым, доступным людям", AnswerCategory.E), new Answer("быть сдержанным, скрытным", AnswerCategory.I)}));
        questions.add(new Question("В литературных произведениях вы предпочитаете:", new Answer[]{new Answer("буквальность, конкретность", AnswerCategory.S), new Answer("образность, переносный смысл", AnswerCategory.N)}));
        questions.add(new Question("Что для вас труднее:", new Answer[]{new Answer("находить общий язык", AnswerCategory.S), new Answer("использовать других в своих интересах", AnswerCategory.N)}));
        questions.add(new Question("Что бы вы себе больше пожелали:", new Answer[]{new Answer("ясности размышлений", AnswerCategory.T), new Answer("умения сочувствовать", AnswerCategory.F)}));
        questions.add(new Question("Что хуже:", new Answer[]{new Answer("быть неприхотливым", AnswerCategory.T), new Answer("быть излишне привередливым", AnswerCategory.F)}));
        questions.add(new Question("Вы предпочитаете:", new Answer[]{new Answer("запланировать события", AnswerCategory.J), new Answer("незапланированные события", AnswerCategory.P)}));
        questions.add(new Question("Вы склонны поступать скорее:", new Answer[]{new Answer("обдуманно, чем импульсивно", AnswerCategory.J), new Answer("импульсивно, чем обдуманно", AnswerCategory.P)}));
    }
}
