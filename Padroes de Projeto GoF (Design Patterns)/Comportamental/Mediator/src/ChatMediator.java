import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//SALA DE CHAT
public class ChatMediator extends Mediator{

    private Hashtable<String, Participante> participantes = new Hashtable<String, Participante>();

    private List<String> palavrasProibidas = new ArrayList<>();

    public ChatMediator(){
        //CARREGA A LISTA DE PALAVRAS PROIBIDAS NA SALA DE CHAT
        palavrasProibidas.add("xxxxxx");
        palavrasProibidas.add("@!xx");
        palavrasProibidas.add("####@!");
    }

    public void registraParticipante(Participante p){
        //VERIFICA SE NÃO EXISTE DOIS PARTICIPANTES COM O MESMO APELIDO NA SALA DE CHAT
        if(!participantes.containsKey(p.getNome())){
            participantes.put(p.getNome(), p);
        }
        else {
            System.out.println("Usuário já cadastrado.");
        }
    }

    public void enviaMensagem(String remetente, String destinatario, String mensagem){
        //VERIFICA SE O REMETENTE E O DESTINATARIO ESTÃO NA SALA DE CHAT
        if(participantes.containsKey(remetente) && participantes.containsKey(destinatario)){
            //OBTÉM O USUÁRIO REMETENTE
            Participante pRemetente = participantes.get(remetente);

            //OBTÉM O USUÁRIO DESTINATÁRIO
            Participante pDestinatario = participantes.get(destinatario);

            //VERIFICA SE A MENSAGEM CONTÉM PALAVRAS PROIBIDAS.
            for(String proibido : palavrasProibidas) {
                if(mensagem.contains(proibido)){
                    pRemetente.recebeMensagem("Mediador", "Você escreveu uma mensagem contendo palavras impróprias.");
                    return;
                }
            }

            //SE NÃO HÁ PALAVRAS PROIBIDAS NA MENSAGEM, ENTÃO ELA É ENVIADA AO DESTINATÁRIO
            pDestinatario.recebeMensagem(remetente, mensagem);
        }
    }


}
