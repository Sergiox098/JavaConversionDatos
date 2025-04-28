# JavaConversionDatos
En este repositorio se hace prueba de conversión entre variables primitivas y variables de tipo objeto, explorando los métodos que estos últimos poseen.


## 1. Creación del objeto Scanner:
A través de la libreria java.utils.Scanner se puede importar un objeto que es capaz de recibir información, en este caso a través de la consola. Para ello se debe crear un constructor (new Scanner) y especificar de donde sacará la información, en este caso System.In

![image](https://github.com/user-attachments/assets/885890ae-adda-424a-8fdb-c32fadd79296)

## 2. Solicitud de datos:
A través de un bloque de texto (System.out.PrintLn("""   """) se le informa al usuario los datos que debe de escribir. Se realiza a través de un bloque de texto debido al gran tamaño y los saltos de linea, ya que así se simplifica el printLn.

![image](https://github.com/user-attachments/assets/e7ce205b-4cee-4043-9dcd-df26950efe73)

## 3. Creación de las variables:
Se crean las variables las cuales su valor proviene de la información suministrada por el usuario a través de la consola, usando el objeto Scanner creado anteriormente. Estas variables son: String de tipo objeto, int de tipo primitivo, boolean de tipo primitivo, float de tipo primitivo.

![image](https://github.com/user-attachments/assets/49dc8118-bf62-4ef8-9264-f3d5466d5622)

## 4. Conversión de variable String:
El string se convierte en el código ASCII de cada char que lo compone. Para realizar esta conversión primero convierto el string en un arreglo de chars, usando el método .toCharArray() y encuentro el tamaño del string con el método .lenght(). Posteriormente se crea un ciclo for, siendo i el iterador, la condición i < el tamaño del string, y con un aumento de 1 en i. Luego una variable almacena el valor del arreglo de chars en la posición i, para finalizar con un printLn que también imprime el codigo ASCII con (int). También la variable x podría ser de tipo Character, y usar el método .hashCode()

![image](https://github.com/user-attachments/assets/b48cc42f-60d8-4447-b5fd-92d97b185682)

## 5. Conversión de variable Int:
En este caso la variable que almacena la edad del usuario lo convierte a un string que contiene el valor en binario. Se realiza a través de un método del objeto Integer llamado  .toBinaryString(x)

![image](https://github.com/user-attachments/assets/b190c9b3-c4ce-40bb-8571-fc99a4237bd4)

## 6. Conversión variable Boolean:
Las variables boolean no poseen demasiada utilidad convertirla a otro tipo, ya que estas su valor solo es True o False, pero en este caso con el objeto Boolean se convierte a String.

![image](https://github.com/user-attachments/assets/4c2fdc9e-9687-4e94-9c41-4f1042581b2b)

## 7. Conversión variable Float.
En este caso vamos a ver el comportamiento de double, float e int, reflejado en la cantidad de decimales que posee. Se le pide al usuario que escoja 1 para Pi y 2 para Euler, y a continuación ve el tamaño que puede almaacenar cada uno de estos tipos en estos dos números.

![image](https://github.com/user-attachments/assets/6955157e-df1e-4ae3-8ad7-f29803f0974a)

# Salida en Consola

Solicitar datos:

![image](https://github.com/user-attachments/assets/9a1deb90-aa9d-4d29-a356-314c05c4ab63)

String

![image](https://github.com/user-attachments/assets/29768c6a-705f-4cb4-8fd4-490783016687)

Int

![image](https://github.com/user-attachments/assets/3e88c6c3-d147-4c9a-8dcc-297127713fa9)

Boolean

![image](https://github.com/user-attachments/assets/d408ec17-bdee-42f6-8653-dcb055e560fc)

Float

![image](https://github.com/user-attachments/assets/999d4286-3c13-4a68-98a1-3cd4731033d6)
