package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncinal implements Copiadora, Digitalizadora, Impressora{

   
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    
}
