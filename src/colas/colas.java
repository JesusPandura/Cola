package colas;



public class colas {

    public static void main(String[] args) {
      
        //Usamos nuestra clase
        System.out.println("Nuestra implementacion");
        ColaDinamica<Integer> cola = new ColaDinamica<>();
        
        System.out.println("El tamaño es: "+cola.size());
        System.out.println("¿Esta vacia? (inicio) "+cola.isEmpty());
        
        cola.enqueue(4);
        cola.enqueue(1);
        cola.enqueue(3);
        cola.dequeue();
        cola.enqueue(8);
        cola.dequeue();
        cola.enqueue(10);
        cola.enqueue(2);
        cola.enqueue(5);
        cola.enqueue(12);
        cola.enqueue(4);
        
        System.out.println("El tamaño es: "+cola.size());
        System.out.println("¿Esta vacia? (despues de agregar) "+cola.isEmpty());
        
        System.out.println("El primero es: "+cola.primero());
        
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(+cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(+cola.dequeue());
        
        System.out.println("El tamaño es: "+cola.size());
        System.out.println("¿Esta vacia? (despues de quitar) "+cola.isEmpty());
        
      
    }
    
}
