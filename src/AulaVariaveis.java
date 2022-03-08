import javax.swing.*;

public class AulaVariaveis {
    public static void main(String[] args) {

        int nota1 = 7;
        int nota2 = 7;
        int nota3 = 7;
        int nota4 = 7;
        int media;
        String saidaResultado;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 0) {
            if (media >= 5) {
                if (media >= 7) {
                    JOptionPane.showMessageDialog(null, "Voce está Aprovado");
                } else {
                    JOptionPane.showMessageDialog(null, "Voce está de Recuperação");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Voce Reprovou");
            }
        }
    }
}

        //    if (media >= 0) {
        //      if (media >= 5) {
        //          if (media >= 7) {
        // /            System.out.println("Aluno Aprovado");
        //         } else {
        //             System.out.println("Aluno de Recuperação");
        //         }
        //     } else {
        //         System.out.println("Aluno Reprovado");
        //     }
        //}






