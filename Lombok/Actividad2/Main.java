package Lombok.Actividad2;

public class Main {
    public static void main(String[]args){
        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Juan")
                .email("Juanexample@mail.com")
                .build();
        System.out.println(u1);
    }
}
