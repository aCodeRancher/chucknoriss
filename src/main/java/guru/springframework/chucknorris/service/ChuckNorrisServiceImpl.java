package guru.springframework.chucknorris.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService {

    private ChuckNorrisQuotes quotes;

    public ChuckNorrisServiceImpl(ChuckNorrisQuotes quotes){
        this.quotes = quotes;
    }

    public String getJoke(){
       return quotes.getRandomQuote();
    }
}
