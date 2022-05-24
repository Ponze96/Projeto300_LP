package exercicios300;

public class Exercicio9 {
	
		int dia, mes, ano;

		public Exercicio9(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
		public boolean validaData() {
			if (ano >= 0 ) {
				if ((mes >= 1) && (mes < 12)) {
					
					if (mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 ||
							mes == 10 || mes == 12 ) {
						if (dia >=1 && dia <= 31) {
							return true;
						}
						
						else {
							return false;
						}
											
					}
					
					else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
						if (dia >= 1  && dia <= 30) {
							return true;
							
						}
						else {
							return false;
							
						}
					}
						else {
							// mes de fevereiro
							if(ano % 4 != 0) { // Ano não é bissexto
								
								if(dia >= 1  && dia <= 29) {
									return true;
								} else {
									return false;
								}
								
							}
							
						}
					}
     			}
				
			else {
				return false;
			}
		
			return false;
		
	}
		
		public void mostrarData() {
			if(validaData()) {
				System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
			}
			else {
				System.out.println("Data não é valida. ");
			}
		}
		
}	
	

	
