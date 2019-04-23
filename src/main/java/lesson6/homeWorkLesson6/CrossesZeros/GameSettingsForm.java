package lesson6.homeWorkLesson6.CrossesZeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsForm extends JFrame {
    GameSettingsForm gameSettingsForm = this;
    public GameSettingsForm() {
        setTitle("Настройки игры");
        setBounds(450, 450, 240, 190);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel jLabelMode = new JLabel("Выберите режим игры:");
        add(jLabelMode);
        JRadioButton radioButtonModeTwoPlayers = new JRadioButton("Игрок против игрока");
        add(radioButtonModeTwoPlayers);
        JRadioButton radioButtonModeTwoComputers = new JRadioButton("Компутер против компутера");
        add(radioButtonModeTwoComputers);
     //   radioButtonModeTwoPlayers.setSelected(true);
        JRadioButton radioButtonModeAgainstAI = new JRadioButton("Игрок против компьютера");
        add(radioButtonModeAgainstAI);
        JLabel jLabelAILevel = new JLabel("Выберете уровень Комплюхтера:");
        add(jLabelAILevel);
         JRadioButton jRadiobutton = new JRadioButton();
     //   add(jSlider);
     //   jSlider.setAlignmentX(LEFT_ALIGNMENT);
     //   jSlider.setVisible(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonModeTwoPlayers);
        buttonGroup.add(radioButtonModeAgainstAI);
     //   JLabel jLabelLinesCount = new JLabel("Размер поля (по умолчанию 3 на 3): ");
      //  add(jLabelLinesCount);
      //  JTextField jTextFieldLinesCount = new JTextField();
     //   jTextFieldLinesCount.setMaximumSize(new Dimension(100, 20));
     //   add(jTextFieldLinesCount);
        JRadioButton radioButtonSimpleLevel = new JRadioButton("Простой");
        JRadioButton radioButtonNotSimpleLevel = new JRadioButton("Сложный");
        add(radioButtonSimpleLevel);
        add(radioButtonNotSimpleLevel);
        radioButtonSimpleLevel.setVisible(false);
        radioButtonNotSimpleLevel.setVisible(false);
        JButton jButtonSetSettings = new JButton("Начать игру!");
        add(jButtonSetSettings);
        setVisible(true);
//
//        radioButtonModeAgainstAI.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (radioButtonModeAgainstAI.isSelected()) {
//                    radioButtonSimpleLevel.setVisible(true);
//                    radioButtonNotSimpleLevel.setVisible(true);
//                }
//            }
//        });
//
//        radioButtonModeTwoPlayers.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (radioButtonModeTwoPlayers.isSelected()) {
//                    radioButtonSimpleLevel.setVisible(false);
//                    radioButtonNotSimpleLevel.setVisible(false);
//                }
//            }
//        });
//
//        radioButtonModeTwoComputers.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (radioButtonModeTwoPlayers.isSelected()) {
//                    radioButtonSimpleLevel.setVisible(true);
//                    radioButtonNotSimpleLevel.setVisible(true);
//                }
//            }
//        });
//
//        jButtonSetSettings.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MainGameField gameField = MainGameField.getInstance();
//          //      if (jTextFieldLinesCount.getText().isEmpty()) {
//                    gameField.linesCount = 3;
////                }
////                else {
////                    try {
////                        gameField.linesCount = Integer.parseInt(jTextFieldLinesCount.getText());
////                    }
////                    catch (NumberFormatException ex) {
////                        System.out.println("Необходимо ввести целое число!");
////                    }
////                }
//                gameField.startNewGame();
//                if (radioButtonModeAgainstAI.isSelected() || radioButtonModeTwoComputers.isSelected()) {
//                    gameField.gameMode = 2;
//                }
//             //   gameField.aiLevel = jRadiobutton.getValue();
//                gameSettingsForm.setVisible(false);
//            }
//        });
    }
}
