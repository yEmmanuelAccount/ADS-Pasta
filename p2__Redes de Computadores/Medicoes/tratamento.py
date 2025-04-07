# Definindo as variáveis como strings
DUT_IP = "192.168.56.105"
DOCKER_IP = "192.168.56.106"

# Lendo o texto original do arquivo input.txt
with open('Dias/23janeiro25.txt', 'r') as file:
    texto_original = file.read()

# Substituindo todas as ocorrências das variáveis pelos seus valores
texto_modificado = texto_original.replace('DUT_IP', DUT_IP)
texto_modificado = texto_modificado.replace('DOCKER_IP', DOCKER_IP)

# Salvando o texto modificado em um novo arquivo output.txt
with open('ler.txt', 'w') as file:
    file.write(texto_modificado)

print('Texto modificado salvo em output.txt:')
print(texto_modificado)
