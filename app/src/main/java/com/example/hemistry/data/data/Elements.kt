package com.example.hemistry.data.data

import com.example.hemistry.domain.model.ElementDetailsModel
import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.domain.model.Question

object Elements {
    fun getElements(): List<ElementListModel> {
        val list = mutableListOf<ElementListModel>()
        list.add(ElementListModel(1, "Гидроген", "1.00794±7", 1, "H", "VII"))
        list.add(ElementListModel(2, "Гелий", "4.002602±2", 1, "He", "VIII"))
        list.add(ElementListModel(3, "Литий", "6.941±2", 1, "Li", "I"))
        list.add(ElementListModel(4, "Бериллий", "9.01218±1", 1, "Be", "II"))
        list.add(ElementListModel(5, "Бор", "10.811±5", 2, "B", "III"))
        list.add(ElementListModel(6, "Карбон", "9.01218±1", 2, "C", "IV"))
        list.add(ElementListModel(7, "Нитроген", "14.0067±1", 2, "N", "V"))
        list.add(ElementListModel(8, "Оксиген", "15.9994±3", 2, "O", "VI"))
        list.add(ElementListModel(9, "Фтор", "18.998403±1", 2, "F", "VII"))
        list.add(ElementListModel(10, "Неон", "20.179±1", 2, "Ne", "VIII"))
        return list
    }

    fun getElementsById(id: Int): ElementListModel {
        val position = getElements().indexOfFirst { it.id == id }
        return getElements()[position]
    }

    private fun getElementsDetails(): List<ElementDetailsModel> {
        val list = mutableListOf<ElementDetailsModel>()
        list.add(
            ElementDetailsModel(
                1,
                "2,1",
                "-255.34°C",
                "-252.87°C",
                "0",
                "8.988x10!^5 г/см^3",
                "Генри Кавендиш Англия 1766г"
            )
        )
        list.add(
            ElementDetailsModel(
                2,
                "",
                "-272,2°C",
                "-268,934°C",
                "0",
                "0,0001787 г/см^3",
                "Вилям Рэмсли, Нилс Ленгет, П.Т. Клив"
            )
        )
        list.add(
            ElementDetailsModel(
                3,
                "0,97",
                "180,54°C",
                "1342°C",
                "71",
                "0,53 г/см^3",
                "Йоханн Арфведсон"
            )
        )
        list.add(
            ElementDetailsModel(
                4,
                "1,47",
                "1287°C",
                "2472°C",
                "179",
                "1,848 г/см^3",
                "Ф. Велер, А. А. Басси"
            )
        )
        list.add(
            ElementDetailsModel(
                5,
                "2,02",
                "2079°C",
                "4000°C",
                "26",
                "2,34 г/см^3",
                "Г. Дэви, Ж. Гей-Люссак, Л. Тенар"
            )
        )
        list.add(ElementDetailsModel(6, "2,50", "3825°C", "4827°C", "0", "2,62 г/см^3", ""))
        list.add(
            ElementDetailsModel(
                7,
                "3,07",
                "-209,86°C",
                "-195,8°C",
                "0",
                "0,0012506 г/см^3",
                "Даниэл Резерфорд"
            )
        )
        list.add(
            ElementDetailsModel(
                8,
                "3,50",
                "-218,4°C",
                "-182,962°C",
                "0",
                "0,001429 г/см^3",
                "Ҷозеф Пристли, Карл Вилям Шейл"
            )
        )
        list.add(
            ElementDetailsModel(
                9,
                "4,10",
                "-219,62°C",
                "-188,14°C",
                "0",
                "0,001696 г/см^3",
                "Генри Муассан"
            )
        )
        list.add(
            ElementDetailsModel(
                10,
                "",
                "-248,67°C",
                "-246,048°C",
                "0",
                "0,0008999 г/см^3",
                "Вилям Рамзай, М. Траверс"
            )
        )
        return list
    }


    fun getQuestions(): MutableList<Question> {
        val questionsList = mutableListOf<Question>()

        val question1 = Question(
            1,
            "Сатрҳои уфуқӣ дар ҷадвали даврии элементҳо чӣ ном доранд?",
            "давра",
            "Гурӯҳ",
            "зергурӯҳ",
            1
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "Сатрҳои амудии ҷадвали даврии элементҳо чӣ ном доранд?",
            "давра",
            "Гурӯҳ",
            "зергурӯҳ",
            2
        )
        questionsList.add(question2)

        val question3 = Question(
            1,
            "Давраҳо кадомҳоянд?",
            "калон ва хурд",
            "васеъ ва танг",
            "танҳо як давра",
            1
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "Гурӯҳҳо ба кадом зергурӯҳҳо тақсим мешаванд?",
            "асосӣ ва тарафӣ",
            "калон ва хурд",
            "гурӯҳи якум",
            1
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Массаи атом нисбат ба кадом элемент аст?",
            "гидроген",
            "карбон",
            "оксиген",
            2
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            "Кадом элементи химиявӣ вазни атомӣ дорад, ки арзиши бутун нест?",
            "хлор",
            "нитроген",
            "карбон",
            1
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "Вазни атомии мис чанд аст?",
            "63",
            "63.5",
            "64",
            3
        )
        questionsList.add(question7)


        val question8 = Question(
            1,
            "Вазни атомии хлор чанд аст?",
            "35",
            "35.5",
            "36",
            2
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "Рамзи химиявии натрий чист?",
            "Н",
            "Na",
            "Nt",
            2
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "Гурӯҳи якуми ҷадвали даврии элементҳои химиявӣ чӣ ном дорад?",
            "металлҳои сілтӣ",
            "металлњои ишќорї",
            "номи худро надорад",
            1
        )
        questionsList.add(question10)
        return questionsList
    }

    fun getDetailsElementById(id: Int): ElementDetailsModel {
        val position = getElementsDetails().indexOfFirst { it.id == id }
        return getElementsDetails()[position]
    }
}