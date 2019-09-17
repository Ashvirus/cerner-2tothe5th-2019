#cerner_2^5_2019
import requests;
import json;
print('Type your lucky number to find your favorite pokemon')
id = input()
response = requests.get("https://pokeapi.co/api/v2/pokemon/"+str(id))
output= json.loads(response.text)
print("Name: \n",output["name"])
ability = output["abilities"]
forms = output["forms"]
moves = output["moves"]
types = output["types"]
print("Abilities: ")
for i in ability:
    print(i["ability"]["name"]+" ", end="")
print("\nForms: ")
for i in forms:
    print(i["name"]+" ", end="")
print("\nMoves: ")
for i in moves:
    print(i["move"]["name"]+" ", end="")
print("\nTypes: ")
for i in types:
    print(i["type"]["name"]+" ", end="")
