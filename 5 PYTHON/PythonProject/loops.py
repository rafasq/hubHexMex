# while True:
#     name = input('Please type your name: ')
#     if name == 'Sam':
#         break
# print('Thank you!')

while True:
    name = input('Who are you? ')
    if name != 'Joe':
        continue
    password = input('Password? (It is a fish.): ')
    if password == 'swordfish':
        break
...
print('Access granted.')