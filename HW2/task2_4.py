"""
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
"""


while True:
    try:
        text = input("Input string: ")
        if not text:
            raise ValueError('Exception! Empty string')
    except ValueError as e:
        print(e)
        continue
    else:
        print("Good job")
        break
