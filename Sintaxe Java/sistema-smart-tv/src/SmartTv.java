public class SmartTv {
        
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar(){
            ligada = true;
            System.out.println("Ligando");
        }

        public void desligar(){
            ligada = false;
            System.out.println("Desligando");
        }

        public String informarEstado (String informaEstado){
            if (ligada == false) {
                informaEstado = "Estado Atual: Desligada";
            } if (ligada == true) {
                informaEstado = "Estado Atual: Ligada";
            }
            return informaEstado;
        }

        public void mudarCanal(int novoCanal){
            canal = novoCanal;
            System.out.println("Mudando Canal para: " + canal);
        }

        public void aumentarCanal(){
            canal++;
            System.out.println("Aumentando canal para: " + canal);
        }

        public void diminuirCanal(){
            canal--;
            System.out.println("Diminuindo canal para: " + canal);
        }

        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando volume para: " + volume);
        }

        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo volume para: " + volume);
        }
    }