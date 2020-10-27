import java.util.Scanner;


public class puntos {
    
                
    public static void main(String[] args) {
        
        Scanner inicio = new Scanner(System.in);
        
 /*         
1. Elabore un algoritmo que permita calcular la base de un triángulo. 
Como datos de entrada se tiene el área y la altura. 
   
         
        int altura = 5;
        double area = 4;
        double resultado_base = (2*area/altura); 
        
        System.out.println("esta es la base de un triangulo = " + resultado_base);
         
        
        
         
2. Elaborar un algoritmo que le muestre al usuario el dinero que pude ahorrar en un año.
  El usuario ingresará su salario mensual, el monto de los ingresos extras mensuales y
el valor de los gastos mensuales.

        int salario;
        int ingresoExtr_aMensual;
        int gastoMensual;
        
        System.out.print("Ingrese su salario mensual: ");
        salario = inicio.nextInt();
        System.out.print("cual es su ingreso extra mensual: ");
        ingresoExtra_Mensual = inicio.nextInt();
        System.out.print("Ingrese su gasto mensual: ");
        gastoMensual = inicio.nextInt();
        
        int ahorroMensual = (salario + ingresoExtra_Mensual)- gastoMensual ;
        int ahorroAnual = ahorroMensual*12;
        System.out.print("Este es su ahorrar mensual = " + ahorroMensual +"\n");
        System.out.print("Este es el dinero que se puede ahorrar en un año = " + ahorroAnual);
       
         
         
      
 3. En un lavadero de vehículos se relacionan al final del día la cantidad de taxis que se
lavaron, la cantidad de buses, la cantidad de particulares y la cantidad de motos.
Se desea un programa que muestre el dinero realizado por cada tipo de vehículo
(taxis, buses, particulares y motos) y el total realizado en el lavadero. El precio de los
taxis es de $3.000, los buses a $10.000, los particulares a $5.000 y las motos a
$2.000.

         int taxi;
         int buse;
         int particulare;
         int moto;
         
         System.out.print("Bienvenidos lavadero de vehiculos"+ "\n");
         System.out.print("numero de taxis que se lavaron en el dia ");
         taxi = entrada.nextInt();
         System.out.print("Numero de buses que se lavaron en el dia ");
         buse = entrada.nextInt();
         System.out.print("Numero de particulares que se lavaron en el dia ");
         particulare = entrada.nextInt();
         System.out.print("Numero de motos que se lavaron en el dia ");
         moto = entrada.nextInt();
         System.out.print("\n");
         
         int valor_Taxi = taxi*3000;
         int valor_Bus = buse*10000;
         int valor_Particular = particulare*5000;
         int valor_Moto = moto*2000;
         int valor_Total = (valor_Taxi+valor_Bus+valor_Particular+valor_Moto);
         
         System.out.print("Dinero realizado por cada tipo de vehiculo"+ "\n");
         System.out.print("Taxis = " + valor_Taxi + "\n");
         System.out.print("Buses = " + valor_Bus + "\n");
         System.out.print("Particulares = " + valor_Particular + "\n");
         System.out.print("Motos = " + valor_Moto + "\n" );
         System.out.print("Total de ventas en el dia = "+ valorTotal);
         
         
         
         
        
4. Elaborar un algoritmo que le permita al usuario ingresar los nombres y las edades de
    3 hermanos y el computador le muestre los 3 nombres y el promedio de edad de ellos.          


        
        String nombre;
        String nombre2;
        String nombre3;
        int edad;
        int edad2;
        int edad3;
        int promedio_Edad;
        
       System.out.print("Ingrese el primer nombre");
       nombre = entrada.next();
       System.out.print("Ingrese la edad del primer nombre"); 
       edad = entrada.nextInt();
       System.out.print("Ingrese el segundo nombre");
       nombre2 = entrada.next();
       System.out.print("Ingrese la edad del segundo nombre"); 
       edad2 = entrada.nextInt();
       System.out.print("Ingrese el tercer nombre"); 
       nombre3 = entrada.next();
       System.out.print("Ingrese la edad del tercer nombre"); 
       edad3 = entrada.nextInt();
       System.out.print("\n"); 
       
       promedioEdad = (edad+edad2+edad3)/3;
       System.out.print("lista de nombres " + "\n");
       System.out.print(nombre + "\n");
       System.out.print(nombre2 + "\n");
       System.out.print(nombre3 + "\n");
       System.out.print("El promedio de su edad es de = "+ promedioEdad);
      

        


5. Elaborar un algoritmo que le permita al usuario ingresar la altura y la base de un
triangulo y el radio de un círculo y le muestre en la pantalla el área de estas dos
figuras.         


    
     double alt_Triangulo;
     double bas_Triangulo;
     double rad_Circulo;
     double ar_Triangulo;
     double ar_Circulo;
     
     System.out.print("Ingresa la altura de un triangulo ");
     alt_Triangulo = entrada.nextDouble();
     System.out.print("Ingresa la base de un triangulo ");
     bas_Triangulo = entrada.nextDouble();
     System.out.print("Ingresa el radio de un circulo ");
     rad_Circulo = entrada.nextDouble();
     System.out.print("\n"); 
     
     ar_Triangulo = (bas_Triangulo*alt_Triangulo)/2;
     ar_Circulo = 3.1416 * Math.pow(rad_Circulo, 2);
     
     System.out.print("El area de un triangulo es = "+ ar_Triangulo + "\n");
     System.out.print("El area de un circulo es = "+ ar_Circulo);
  
     
     
     
    
6. Elaborar un algoritmo que le permita al usuario ingresar la distancia recorrida por un
vehículo y el tiempo que se demoró en recorrerlo y el computador le muestre la
velocidad con que la recorrió.  

 
     
    double distan_Recorrida;
    double tiempo;
    double velocidad;
    
    System.out.print("Distancia recorrida por el vehiculo en kilometros");
    distan_Recorrida = inicio.nextDouble();
    System.out.print("Tiempo recorrerlo por minutos");
    tiempo = inicio.nextDouble();
    System.out.print("\n"); 
    
    velocidad = distan_Recorrida/tiempo;
    System.out.print("Velocidad con la que recorrio el vehiculo por hora es = "+velocidad);
   
 
     

7. Una persona posee dos buses, al final del día desea conocer el producido pos cada
bus y el total del producido. Por cada bus se digita el número de pasajeros
transportados y el valor del pasaje. 
    
     
    
     double bus;
     double bus2;   
     double valor;
     double valor2;
     double totalBus;
     double totalBus2;
     double total_Producido;
     
     System.out.print("Cantidad de pasajeros transportados por bus 1");
     bus = inicio.nextDouble();
     System.out.print("valor del pasaje del bus 1");
     valor = inicio.nextDouble();
     System.out.print("cantidad de pasajeros transportados por bus 2");
     bus2 = inicio.nextDouble();
     System.out.print("valor del pasaje del bus 2");
     valor2 = inicio.nextDouble();
     System.out.print("\n");
     
     totalBus = bus*valor;
     totalBus2 = bus2*valor2;
     total_Producido = totalBus+totalBus2;
     
     System.out.print("Total producido por el bus 1 = "+ totalBus + "\n");
     System.out.print("Total producido por el bus 2 = "+ totalBus2 + "\n");
     System.out.print("Total producido por los dos buses = "+ total_Producido);
     
    
    
    
     
8.Elabore un algoritmo que le muestre al usuario el total de dinero que tiene sabiendo
que el algoritmo le pide que digite: el número de billetes de $1000, de $2000, de
$5000, de $10.000, de 20.000 y de 50.000 que posee. 
  
    
    
  
    double bill_1000;
    double bill_2000;
    double bill_5000;
    double bill10000;
    double bill_20000;
    double bill_50000;
    double totalBillete;
    double valor_1;
    double valor_2;
    double valor_3;
    double valor-4;
    double valor_5;
    double valor_6;
    
    
    System.out.print("Total de billetes de 1000");
    bill-1000 = inicio.nextDouble();
    System.out.print("total de billetes de 2000");
    bill_2000 = inicio.nextDouble();
    System.out.print("Total de billetes de 5000");
    bill_5000 = inicio.nextDouble();
    System.out.print("Total de billetes de 10000");
    bill_10000 = inicio.nextDouble();
    System.out.print("Total de billetes de 20000");
    bill_20000 = inicio.nextDouble();
    System.out.print("Total de billetes de 50000");
    bill_50000 = inicio.nextDouble();
    System.out.print("\n");
    
    valor_1 = bill_1000*1000;
    valor_2 = bill_2000*2000;
    valor_3 = bill_5000*5000;
    valor_4 = bill_10000*10000;
    valor_5 = bill_20000*20000;
    valor_6 = bill_50000*50000; 
    totalBillete =valor_1+valor_2+valor_3+valor_4+valor_5+valor_6; 
    System.out.print("total de billetes es = " +totalBillete);
     
  
  
 
9.Escriba un algoritmo que le permita al propietario de un bus ingresar el número de
pasajeros transportados en un día, el valor del pasaje y el valor pagado por
combustible. El programa le debe mostrar el total producido por el bus, el valor
pagado al conductor (que es el 10% del total producido) y la ganancia neta (producido
menos los gastos).   



float bus;
float pasaje;
float combustible; 
float totalProducido;
float pagoConductor;
float gananciaNeta;

 
System.out.print("numero de pasajeros transportados por el bus");
bus = inicio.nextFloat();
System.out.print("Valor del pasaje el bus");
pasaje = inicio.nextFloat();
System.out.print("Valor pagado por combustible");
combustible = inicio.nextFloat();
System.out.print("\n");

totalProducido = (bus*pasaje)+combustible;
pagoConductor = (float) ((totalProducido*10)/100);
gananciaNeta = totalProducido-combustible-pagoConductor;
System.out.print("Total producido por el bus ="+totalProducido+"\n");
System.out.print("Valor pagado al conductor ="+pagoConductor+"\n");
System.out.print("Ganancia neta ="+gananciaNeta+"\n");

 
 



10. Elabore un algoritmo que permita averiguar cual es el nombre del mayor de 2
hermanos no gemelos. Como datos de entrada se tiene el nombre y la edad de las 2
personas. 


    
    
     String manito1;
     String manito2;
     int edadManito1;  
     int edadManito2; 
     

     System.out.print("nombre del primer hermano");
     manito1 = inicio.next();
     System.out.print("edad del primer hermano");
     edadManito1 = inicio.nextInt();
     System.out.print("nombre del segundo hermano");
     manito2 = inicio.next();
     System.out.print("edad del segundo hermano");
     edadManito2 = inicio.nextInt();
     System.out.print("\n");
     
     if (edadManito1>edadManito2) {
     System.out.print("El hermano mayor es " + manito1);
     }else
      System.out.print("El hermano mayor es " + manito2);   
     
     
     
   
      
11.Elaborar Un algoritmo que le permita al usuario leer 3 número y el computador le
imprima el mayor de ellos.      
     
     
     
         
        int n1;
        int n2;
        int n3;       
           
        System.out.print("Ingrese primer número: ");
        n1 = inicio.nextInt();
        System.out.print("Ingrese segundo número: ");
        n2 = inicio.nextInt();
        System.out.print("Ingrese tercer número: ");
        n3 = inicio.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        } 
    
        
        
 
     
 12. Crear un algoritmo que le permita al usuario ingresar 3 números y el computador se
los muestre en orden ascendente        

  
  
     
      int a;
      int b;
      int c;
   
      
        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        a = inicio.nextInt();
        System.out.print("Ingrese numero 2: ");
        b = inicio.nextInt();
        System.out.print("Ingrese numero 3: ");
        c = inicio.nextInt();     
    
   
    
        if(a>b) {
            if(a>c) {
                if(b>c) {
                    System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
                                    
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    
                }
            }else {
                System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
                
            }
        }else {
            if(b>c) {
                if(a>c) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                    
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    
                }              
            }else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
                
            }
        }
       
 
       
   

13.Elaborar un algoritmo que imprima los primeros 15 términos de la siguiente serie de
números :
 4 - 8 - 12 - 16 - 20 - 24 .........   
 
 
 
       
       int serie = 4;
		boolean sumar=true;
		int cont;
		String cadena="Serie: ";
		
		System.out.println("Indique la cantidad de serie: " );
		
		Scanner sc = new Scanner (System.in);
		cont=sc.nextInt();
		
		do{
			
			cadena=cadena.concat(String.valueOf(serie) + "  ");	
			cont --;	
			if(sumar==true){		
				serie+=4;
			}
						
		}while(cont>0);
		
		System.out.println(cadena);
            

       
       
      
       
      
14. Elaborar un algoritmo donde el usuario ingrese la placa de un bus, el número de
pasajeros transportados y la ruta donde prestó el servicio ( A o B) el computador le
debe mostrar el dinero que recolectó sabiendo que en la ruta A el pasaje es a
$1.200.oo y en la B a $1.000.oo 
      
         
       
       
       
       int placa;
       int pasajero;
       String ruta;
       double valor;
       double valor1;
               
       System.out.println("ingrese la placa del bus");
       placa = inicio.nextInt();
       System.out.println("ingrse el numero de pasajeros");
       pasajero = inicio.nextInt();
       System.out.println("ruta donde presto el servicio?");
       ruta = inicio.next();
       
       valor = pasajero*1200;
       valor1 = pasajero*1000; 
       
       if (dineroA>dineroB) {
       System.out.print("Dinero recolectado: " + valor + "ruta: "+ ruta );
       }else
       System.out.print("Dinero recolectado" + valor1 + "ruta: " + ruta);
      
       
       
       
       
      
15.Elaborar un algoritmo que le permita al usuario ingresar los nombres y las edades de 3
hermanos y el computador le muestre los 3 nombres y el promedio de edad de ellos. 




      
        String nombre1;
        String nombre2;
        String nombre3;
        int edad1;
        int edad2;
        int edad3;
        int promedioEdad;
        
       System.out.print("Ingrese el primer nombre");
       nombre1 = inicio.next();
       System.out.print("Ingrese la edad del primer nombre"); 
       edad1 = inicio.nextInt();
       System.out.print("Ingrese el segundo nombre");
       nombre2 = inicio.next();
       System.out.print("Ingrese la edad del segundo nombre"); 
       edad2 = inicio.nextInt();
       System.out.print("Ingrese el tercer nombre"); 
       nombre3 = inicio.next();
       System.out.print("Inicio la edad del tercer nombre"); 
       edad3 = inicio.nextInt();
       System.out.print("\n"); 
       
       promedioEdad = (edad1+edad2+edad3)/3;
       System.out.print("lista de nombres " + "\n");
       System.out.print(nombre1 + "\n");
       System.out.print(nombre2 + "\n");
       System.out.print(nombre3 + "\n");
       System.out.print("El promedio de su edad es de = "+ promedioEdad);
       */
  }  
}
