public class MinhaApp {

    public static void main(String[] args) {

        //CRIA-SE O OBJETO MEDIADOR
        ChatMediator salaChat = new ChatMediator();

        //CRIAM-SE OS OBJETOS PARTICIPATNES
        Participante joao = new ParticipanteImpl("João", salaChat);
        Participante maria = new ParticipanteImpl("Maria", salaChat);
        Participante carlos = new ParticipanteImpl("Carlos", salaChat);
        Participante renato = new ParticipanteImpl("Renato", salaChat);

        //REGISTRA TODOS OS PARTICIPANTES NA SALA DE CHAT
        salaChat.registraParticipante(joao);
        salaChat.registraParticipante(maria);
        salaChat.registraParticipante(carlos);
        salaChat.registraParticipante(renato);


        //INICIA A CONVERSA ENTRE OS PARTICIPANTES
        joao.enviaMensagem("Maria", "Olá Maria, tudo bem?");

        maria.enviaMensagem("João", "Oi tudo! E com você?");

        carlos.enviaMensagem("Renato", "Renato, você é um @!xx.");

        joao.enviaMensagem("Maria", "Você está no trabalho agora?");
    }

}
