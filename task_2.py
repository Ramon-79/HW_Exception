"""
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
"""

import random


def getArray(lenght):
    array = [(random.randint(0, 9)) for i in range(lenght)]
    # print(*array)
    return array


def diffArray(firstArray, secondArray):
    try:
        if len(firstArray) != len(secondArray):
            raise Exception('Ошибка Ошибок')
    except Exception:
        print('Ошибка Ошибок')
    else:
        # print("It's OK")
        pass


firstArray = getArray(5)
secondArray = getArray(6)
diffArray(firstArray, secondArray)
# print(len(firstArray), len(secondArray))
