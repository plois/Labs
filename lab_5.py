'''
№9311
C3: 2
String
C17: 12
Завдання лаб.3: Відсортувати слова заданого тексту за кількістю входжень визначеного символу в них.

Модифікувати лабораторну роботу №3 наступним чином: для літер, слів, речень,
розділових знаків та тексту створити окремі класи. Слово повинно складатися з масиву літер,
речення з масиву слів та розділових знаків, текст з масиву речень.
Замінити послідовність табуляцій та пробілів одним пробілом.

'''
class SortClass_letter():

    def __init__(self, text, symbol):
        self.text = [list(i) for i in text.split()]
        self.symbol = symbol
    def sorting_letter(self):
        lst = self.text
        number_symb = []
        for i in lst:
            tr = []
            k = 0
            for j in list(i):
                if j == self.symbol:
                    k += 1
            tr.append(int(k))
            tr.append(str(i))
            number_symb.append(tr)
        print("\nВідсортований текст:", end=" ")#слова представлені у вигляді масиву літер
        number_symb_2 = []
        for i in sorted(number_symb):
            for j in i:
                if type(j) != int:
                    print(j, end=" ")
                    number_symb_2.append(j)
        print("\nСписок, де вказано число входжень символа в слово(масив літер):\n", sorted(number_symb))#слова представлені у вигляді масиву літер
        return number_symb_2

class SortClass_word():
    def __init__(self, text, symbol):
        self.text = text
        self.symbol = symbol

    def sorting_word(self):
        lst = self.text.split()
        number_symb = []
        for i in lst:
            tr = []
            k = 0
            for j in list(i):
                if j == self.symbol:
                    k+=1
            tr.append(int(k))
            tr.append(str(i))
            number_symb.append(tr)
        print("\nВідсортований текст:", end=" ")
        number_symb_2 = []
        for i in sorted(number_symb):
            for j in i:
                if type(j) != int:
                    print(j, end = " ")
                    number_symb_2.append(j)
        print("\nСписок, де вказано число входжень символа в слово:\n", sorted(number_symb))
        return number_symb_2

class SortClass_sentence():
    def __init__(self, text, symbol):
        self.text = text.split(".")
        self.symbol = symbol

    def sorting_sentence(self):
        print("rest2.0", self.text)

        lst = self.text
        number_symb = []
        for i in lst:
            tr = []
            k = 0
            for j in list(i):
                if j == self.symbol:
                    k += 1
            tr.append(int(k))
            tr.append(str(i))
            number_symb.append(tr)
        print("\nВідсортований текст:", end=" ")
        number_symb_2 = []
        for i in sorted(number_symb):
            for j in i:
                if type(j) != int:
                    print(j, end=" ")
                    number_symb_2.append(j)
        print("\nСписок, де вказано число входжень символа в слово_3,0:\n", sorted(number_symb))
        return number_symb_2



text = input("Введіть текст:\n")
symbol = str(input("Введіть символ:"))

Sorted_letters = SortClass_letter(text, symbol)
Sorted_letters.sorting_letter()

Sorted_words = SortClass_word(text, symbol)
Sorted_words.sorting_word()

Sorted_sentences = SortClass_sentence(text, symbol)
Sorted_sentences.sorting_sentence()
