package lesson6.homeWorkLesson6.CrossesZeros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsForm extends JFrame {
    GameSettingsForm gameSettingsForm = this;
    public GameSettingsForm() {
        setTitle("Настройки игры");
        setBounds(450, 450, 240, 210);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel jLabelMode = new JLabel("Выберите режим игры:");
        add(jLabelMode);
        JRadioButton radioButtonModeTwoPlayers = new JRadioButton("Игрок против игрока");
        add(radioButtonModeTwoPlayers);
        JRadioButton radioButtonModeTwoComputers = new JRadioButton("Компутер против компутера");
        add(radioButtonModeTwoComputers);
        JRadioButton radioButtonModeAgainstAI = new JRadioButton("Игрок против компьютера");
        add(radioButtonModeAgainstAI);
        JLabel jLabelAILevel = new JLabel("Выберите уровень Комплюхтера:");
        add(jLabelAILevel);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonModeAgainstAI);
        buttonGroup.add(radioButtonModeTwoPlayers);
        buttonGroup.add(radioButtonModeTwoComputers);
        JRadioButton radioButtonSimpleLevel = new JRadioButton("Простой");
        JRadioButton radioButtonNotSimpleLevel = new JRadioButton("Сложный");
        add(radioButtonSimpleLevel);
        add(radioButtonNotSimpleLevel);
        radioButtonSimpleLevel.setVisible(false);
        radioButtonNotSimpleLevel.setVisible(false);
        JButton jButtonSetSettings = new JButton("Начать игру!");
        add(jButtonSetSettings);
        setVisible(true);

        radioButtonModeAgainstAI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModeAgainstAI.isSelected()) {
                    radioButtonSimpleLevel.setVisible(true);
                    radioButtonNotSimpleLevel.setVisible(true);
                }
            }
        });

        radioButtonModeTwoPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModeTwoPlayers.isSelected()) {
                    radioButtonSimpleLevel.setVisible(false);
                    radioButtonNotSimpleLevel.setVisible(false);
                }
            }
        });

        radioButtonModeTwoComputers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButtonModeTwoComputers.isSelected()) {
                    radioButtonSimpleLevel.setVisible(true);
                    radioButtonNotSimpleLevel.setVisible(true);
                }
            }
        });

        jButtonSetSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGameField gameField = MainGameField.getInstance();
                    gameField.linesCount = 3;

                gameField.startNewGame();
                if (radioButtonModeAgainstAI.isSelected() || radioButtonModeTwoComputers.isSelected()) {
                    gameField.gameMode = 2;
                }
                gameSettingsForm.setVisible(false);
            }
        });
    }
}
