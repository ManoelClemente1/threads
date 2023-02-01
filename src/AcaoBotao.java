import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TarefaMultiplicacao tarefa = new TarefaMultiplicacao(primeiro, segundo,resultado);
		ImprimeString imprimeString = new ImprimeString();

		Thread threadCalculo = new Thread(tarefa, "thread calculadora");
		Thread threadString = new Thread(imprimeString, "Thread teste String");

		threadCalculo.start();
		threadString.start();
	}

}