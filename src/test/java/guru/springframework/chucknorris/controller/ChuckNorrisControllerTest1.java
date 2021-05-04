package guru.springframework.chucknorris.controller;

import guru.springframework.chucknorris.service.ChuckNorrisService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@WebMvcTest
class ChuckNorrisControllerTest1 {

    @MockBean
    ChuckNorrisService chuckNorrisService;

    @Autowired
    ChuckNorrisController chuckNorrisController;

    @Test
    public void viewJoke(){
        Model model = mock(Model.class);
        when(chuckNorrisService.getJoke()).thenReturn("Random joke");
        String output = chuckNorrisController.viewJoke(model);
        verify(chuckNorrisService,times(1)).getJoke();
        verify (model,times(1)).addAttribute(anyString(), anyString());
        assertTrue(output.equals("index"));
    }
}