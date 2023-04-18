import datetime

now = datetime.datetime.now().strftime("%d-%m-%Y %H:%M:%S")

try:
    a = 7 / 0
except ZeroDivisionError:
    print('Ошибка! Делить на 0 нельзя')


try:
    file = open('test.txt', 'r')
except FileNotFoundError as e:
    print(f"{now} [FileNotFoundError]: {e.strerror}, filename: {e.filename}")


class MyError(Exception):
    def __init__(self, text):
        self.txt = text


try:
    raise MyError('Моя ошибка')
except MyError as error:
    print(error)
