package reflexionYGenericos.Actividad2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main{
    public static void main(String[] args) throws Exception {
        Class<?> clasePersona = Persona.class;

        // 1. Obtener e imprimir constructores
        System.out.println("Constructores:");
        Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();
        for (Constructor<?> c : constructores) {
            System.out.println(c);
        }

        // 2. Instanciar un objeto usando Reflection
        Constructor<?> constructorConArgs = clasePersona.getConstructor(String.class, int.class);
        Object personaObj = constructorConArgs.newInstance("Fausto", 22);

        // 3. Modificar el valor de "nombre" en tiempo de ejecución
        Field campoNombre = clasePersona.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        campoNombre.set(personaObj, "Nahuel");

        // 4. Invocar método mostrarInfo()
        Method metodoMostrarInfo = clasePersona.getMethod("mostrarInfo");
        metodoMostrarInfo.invoke(personaObj);

        // 5. Invocar método privado Saludar (ignorando modificadores)
        Method metodoSaludar = clasePersona.getDeclaredMethod("Saludar");
        metodoSaludar.setAccessible(true);
        metodoSaludar.invoke(personaObj);

        System.out.println("Accedimos a Saludar() aunque sea privado");

        System.out.println("Nuevo modificador de Saludar: "
                + Modifier.toString(metodoSaludar.getModifiers()));
    }
}
