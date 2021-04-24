package ru.itschool.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnSoftwareActivity extends AppCompatActivity {

    ListView listSoftware;
    private List<Word> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_software);
        setInitData();
        listSoftware = findViewById(R.id.listSoftware);
        WordAdapter wordAdapter = new WordAdapter(this, R.layout.list_item, words);
        listSoftware.setAdapter(wordAdapter);

        listSoftware.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word selectedWord = (Word)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Слово: " + selectedWord.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setInitData(){
        words.add(new Word("a compiler", "[ɑ kəmˈpaɪlə]", "компилятор"));
        words.add(new Word("a database", "[ɑ ˈdeɪtəbeɪs]", "база данных"));
        words.add(new Word("a debugger", "[ɑ diːˈbʌɡə(r)]", "отладчик"));
        words.add(new Word("a desktop application/app", "[ɑ ˈdesktɒp æplɪˈkeɪʃn/æp]", "приложение для настольного компьютера"));
        words.add(new Word("a device driver", "[ɑ dɪˈvaɪs ˈdraɪvə]", "драйвер устройства"));
        words.add(new Word("a graphical user interface (GUI)", "[ɑ 'græfɪkl ˈjuːzər ˈɪntəfeɪs]", "графический пользовательский интерфейс"));
        words.add(new Word("a kernel", "[ɑ kɜːnl]", "ядро"));
        words.add(new Word("a mobile application/app", "[ɑ ˈməʊbaɪl æplɪˈkeɪʃn/æp]", "мобильное приложение"));
        words.add(new Word("a plug-in (plugin)", "[ɑ ˈplʌgɪn]", "плагин, расширение, дополнительный программный модуль"));
        words.add(new Word("a programming language", "[ɑ ˈprəʊgræm ˈlæŋgwɪʤ]", "язык программирования"));
        words.add(new Word("a query", "[ɑ ˈkwɪərɪ]", "запрос"));
        words.add(new Word("a scroll bar", "[ɑ skrəʊl bɑː]", "полоса прокрутки"));
        words.add(new Word("a snapshot", "[ɑ snæpʃɒt]", "снимок состояния системы"));
        words.add(new Word("a spreadsheet", "[ɑ ˈspredʃiːt]", "электронная таблица"));
        words.add(new Word("a status bar", "[ɑ ˈsteɪtəs bɑː]", "строка состояния"));
        words.add(new Word("a template", "[ɑ ˈtemplɪt]", "шаблон"));
        words.add(new Word("a version control system (VCS)", "[ɑ vɜːʃn kɒnˈtrəʊl ˈsɪstɪm]", "система контроля версий"));
        words.add(new Word("a web application", "[ɑ web æplɪˈkeɪʃn]", "веб-приложение"));
        words.add(new Word("a word processor", "[ɑ wɜːd ˈprəʊsesə]", "текстовый процессор"));
        words.add(new Word("a text editor", "[ɑ tekst ˈedɪtə]", "текстовый редактор"));
        words.add(new Word("a utility", "[ɑ juːˈtɪlɪtɪ]", "утилита (служебная программа)"));
        words.add(new Word("acceptance testing", "[əkˈseptəns ˈtestɪŋ]", "приемочное тестирование"));
        words.add(new Word("agile methodology", "[ˈæʤaɪl meθəˈdɒləʤɪ]", "гибкая методология разработки"));
        words.add(new Word("an algorithm", "[ɑn ˈælgərɪðm]", "алгоритм"));
        words.add(new Word("an array", "[ɑn əˈreɪ]", "массив"));
        words.add(new Word("an encoding", "[ɑn ɪnˈkəʊdɪŋ]", "кодировка"));
        words.add(new Word("an enterprise application", "[ɑn ˈentəpraɪz æplɪˈkeɪʃn]", "корпоративное приложение"));
        words.add(new Word("an executable (file)", "[ɑn ɪgˈzekjʊtəbl faɪl]", "исполняемый (файл)"));
        words.add(new Word("an interpreter", "[ɑn ɪnˈtɜːprɪtə]", "интерпретатор"));
        words.add(new Word("an operating system (OS)", "[ɑn ˈɒpə()reɪtɪŋ ()sɪstəm]", "операционная система"));
        words.add(new Word("application software", "[æplɪˈkeɪʃn ˈsɒftweə]", "прикладное программное обеспечение"));
        words.add(new Word("aspect-oriented programming (AOP)", "[ˈæspekt-ˈɔːrɪentɪd ˈprəʊgræmɪŋ]", "аспектно-ориентированное программирование"));
        words.add(new Word("binary data", "[ˈbaɪnərɪ ˈdeɪtə]", "двоичные данные"));
        words.add(new Word("commercial software", "[kəˈmɜːʃəl ˈsɒftweə]", "платное программное обеспечение"));
        words.add(new Word("data", "[ˈdeɪtə]", "данные, информация"));
        words.add(new Word("data processing", "[ˈdeɪtə ˈprəʊsesɪŋ]", "обработка данных"));
        words.add(new Word("extreme programming", "[ɪksˈtriːm ˈprəʊgræmɪŋ]", "экстремальное программирование"));
        words.add(new Word("firmware", "[ˈfɜːmweə]", "прошивка, микропрограмма"));
        words.add(new Word("freeware", "[ˈfriːweər]", "бесплатное программное обеспечение"));
        words.add(new Word("incremental development", "[ɪnkrəˈmentl dɪˈveləpmənt]", "инкрементная модель разработки"));
        words.add(new Word("integrated development environment (IDE)", "[ˈɪntɪgreɪtɪd dɪˈveləpmənt ɪnˈvaɪərənmənt]", "интегрированная среда разработки"));
        words.add(new Word("iterative development", "[ˈɪtərətɪv dɪˈveləpmənt]", "итеративная модель разработки"));
        words.add(new Word("malicious software (malware)", "[məˈlɪʃəs ˈsɒftweə]", "вредоносное программное обеспечение"));
        words.add(new Word("object-oriented programming (OOP)", "[ˈɒbʤɛkt-ˈɔːrɪentɪd ˈprəʊgræmɪŋ]", "объектно-ориентированное программирование"));
        words.add(new Word("open source software", "[ˈəʊpən sɔːs ˈsɒftweə]", "программное обеспечение с открытым исходным кодом"));
        words.add(new Word("prototyping", "[ˈprəʊtətaɪpɪŋ]", "создание прототипа, прототипирование"));
        words.add(new Word("rapid application development (RAD)", "[ˈræpɪd æplɪˈkeɪʃn dɪˈveləpmənt]", "быстрая разработка приложений (методология)"));
        words.add(new Word("regression testing", "[rɪˈgreʃn ˈtestɪŋ]", "регрессионное тестирование"));
        words.add(new Word("runtime (runtime environment)", "[rʌnˈtaɪm]", "среда выполнения кода"));
        words.add(new Word("server software", "[ˈsɜːvə ˈsɒftweə]", "серверное программное обеспечение"));
        words.add(new Word("spiral development", "[ˈspaɪərəl dɪˈveləpmənt]", "спиральная модель разработки"));
        words.add(new Word("spyware", "[ˈspaɪəweər]", "программа-шпион, шпионское программное обеспечение"));
        words.add(new Word("system software", "[ˈsɪstɪm ˈsɒftweə]", "системное программное обеспечение"));
        words.add(new Word("unit testing", "[ˈjuːnɪt ˈtestɪŋ]", "модульное (блочное, компонентное) тестирование"));
        words.add(new Word("waterfall model", "[ˈwɔːtəfɔːl mɒdl]", "каскадная модель разработки"));

        Collections.sort(words);


    }
}