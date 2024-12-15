//package br.com.alura.screenmatch.service;
//
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//public class ConsultaChatGPT {
//    public static String obterTraducao(String texto) {
//        OpenAiService service = new OpenAiService("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");
//
//        CompletionRequest requisicao = CompletionRequest.builder()
//                //.model("gpt-3.5-turbo-instruct")
//                .model("text-davinci-003")
//                //.model("gpt-3.5-turbo")
//                .prompt("traduza para o português o texto: " + texto)
//                .maxTokens(1000)
//                .temperature(0.7)
//                .build();
//
//        var resposta = service.createCompletion(requisicao);
//        return resposta.getChoices().get(0).getText();
//    }
//}