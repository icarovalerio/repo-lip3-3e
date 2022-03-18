import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double media = 6;
		
		if (media >= 6) {
		JOptionPane.showMessageDialog(null,
			media + " Aluno Aprovado!");
	}
		else {JOptionPane.showMessageDialog(null,
			media + " Aluno Reprovado!");
	}
		
		
	}
}
