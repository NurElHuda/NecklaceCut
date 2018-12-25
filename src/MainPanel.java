import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainPanel extends Container {
    StyleContext context;
    StyledDocument document;
    Style style;
    private JPanel panel1;
    private JTextPane statsTextPane;
    private JPanel centerPanel;
    private JPanel statsPanel;
    private JPanel optionsPanel;
    private JButton runButton;
    private JComboBox benchmarckComboBox;
    private JComboBox solvingMethodeComboBox;
    private JPanel necklacePanel;
    private JNecklace JNecklace1;
    private JNecklace JCuttedNecklace1;
    private JButton clearButton;
    private JPanel cuttedNecklacePanel;
    private JPanel choosedMethode;
    private JTextArea solvingMethodeTextArea;
    private int benchmark = 1;
    private int methode = 1;
    private Necklace necklace;
    private Cut cut;

    public MainPanel(myFrame myFrame) {
        $$$setupUI$$$();

        context = new StyleContext();
        document = new DefaultStyledDocument(context);

        runButton.addActionListener(e -> {

            benchmark = benchmarckComboBox.getSelectedIndex();
            methode = solvingMethodeComboBox.getSelectedIndex();

            style = context.getStyle(StyleContext.DEFAULT_STYLE);
            StyleConstants.setAlignment(style, StyleConstants.ALIGN_LEFT);
            StyleConstants.setFontSize(style, 16);
            StyleConstants.setSpaceAbove(style, 10);
            StyleConstants.setSpaceBelow(style, 10);

            switch (benchmark) {
                case 1: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark1);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark2);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark3);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark4);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark5);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 6: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark6);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark7);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 8: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark8);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 9: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark9);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
                case 10: {
                    switch (methode) {
                        case 1: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveWidth(necklace, cut, cuttedNecklacePanel), style);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            myFrame.repaint();
                            myFrame.pack();
                            statsTextPane.setDocument(document);

                            break;
                        }
                        case 2: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveDepth(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 3: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveRandom(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 4: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic1(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 5: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic2(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                        case 6: {
                            necklace = new Necklace(Necklace.benchmark10);
                            cut = new Cut(necklace.getBeads());

                            JNecklace1 = new JNecklace(necklace);
                            JNecklace1.setMaximumSize(new Dimension(1000, 100));
                            JNecklace1.setPreferredSize(new Dimension(1000, 100));
                            necklacePanel.add(JNecklace1);
                            myFrame.repaint();
                            myFrame.pack();

                            try {
                                document.insertString(document.getLength(), Cut.solveHeuristic3(necklace, cut), style);
                                statsTextPane.setDocument(document);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                            break;
                        }
                    }
                    break;
                }
            }
        });

        clearButton.addActionListener(e -> {
            necklace = null;
            cut = null;
            necklacePanel.removeAll();
            necklacePanel.repaint();
            solvingMethodeTextArea.setText("Solving Method  :  ");
            cuttedNecklacePanel.removeAll();
            cuttedNecklacePanel.repaint();
            statsTextPane.setText("");

        });

        benchmarckComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                benchmark = benchmarckComboBox.getSelectedIndex();
                switch (benchmark) {
                    case 1: {
                        necklace = new Necklace(Necklace.benchmark1);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 2: {
                        necklace = new Necklace(Necklace.benchmark2);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 3: {
                        necklace = new Necklace(Necklace.benchmark3);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 4: {
                        necklace = new Necklace(Necklace.benchmark4);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 5: {
                        necklace = new Necklace(Necklace.benchmark5);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 6: {
                        necklace = new Necklace(Necklace.benchmark6);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 7: {
                        necklace = new Necklace(Necklace.benchmark7);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }
                    case 8: {
                        necklace = new Necklace(Necklace.benchmark8);

                        JNecklace1 = new JNecklace(necklace);
                        JNecklace1.setMaximumSize(new Dimension(1000, 100));
                        JNecklace1.setPreferredSize(new Dimension(1000, 100));
                        necklacePanel.add(JNecklace1);
                        necklacePanel.repaint();
                        myFrame.repaint();
                        myFrame.pack();
                        break;
                    }

                }
            }
        });
        solvingMethodeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int methode = solvingMethodeComboBox.getSelectedIndex();
                switch (methode) {
                    case 1: {
                        solvingMethodeTextArea.append("Width.");
                        break;
                    }
                    case 2: {
                        solvingMethodeTextArea.append("Depth.");
                        break;
                    }
                    case 3: {
                        solvingMethodeTextArea.append("Random.");
                        break;
                    }
                    case 4: {
                        solvingMethodeTextArea.append("Manhattan D.");
                        break;
                    }
                    case 5: {
                        solvingMethodeTextArea.append("Euclidean's D.");
                        break;
                    }
                    case 6: {
                        solvingMethodeTextArea.append("Hamming's D.");
                        break;
                    }
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //JNecklace1 = new JNecklace(new Necklace(Necklace.benchmark1));

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setBackground(new Color(-1));
        Font panel1Font = this.$$$getFont$$$("Courier New", -1, 16, panel1.getFont());
        if (panel1Font != null) panel1.setFont(panel1Font);
        panel1.setMinimumSize(new Dimension(800, 582));
        panel1.setPreferredSize(new Dimension(1100, 582));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null));
        optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 20));
        optionsPanel.setMinimumSize(new Dimension(1100, 80));
        optionsPanel.setPreferredSize(new Dimension(1100, 80));
        panel1.add(optionsPanel, BorderLayout.NORTH);
        benchmarckComboBox = new JComboBox();
        benchmarckComboBox.setBackground(new Color(-1));
        benchmarckComboBox.setMinimumSize(new Dimension(200, 40));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Select a Benchmark..");
        defaultComboBoxModel1.addElement("Benchmark 01");
        defaultComboBoxModel1.addElement("Benchmark 02");
        defaultComboBoxModel1.addElement("Benchmark 03");
        defaultComboBoxModel1.addElement("Benchmark 04");
        defaultComboBoxModel1.addElement("Benchmark 05");
        defaultComboBoxModel1.addElement("Benchmark 06");
        defaultComboBoxModel1.addElement("Benchmark 07");
        defaultComboBoxModel1.addElement("Benchmark 08");
        defaultComboBoxModel1.addElement("Benchmark 09");
        defaultComboBoxModel1.addElement("Benchmark 10");
        benchmarckComboBox.setModel(defaultComboBoxModel1);
        benchmarckComboBox.setPreferredSize(new Dimension(230, 40));
        benchmarckComboBox.putClientProperty("html.disable", Boolean.FALSE);
        optionsPanel.add(benchmarckComboBox);
        solvingMethodeComboBox = new JComboBox();
        solvingMethodeComboBox.setBackground(new Color(-1));
        solvingMethodeComboBox.setMinimumSize(new Dimension(200, 40));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Select a solving methode..");
        defaultComboBoxModel2.addElement("Width");
        defaultComboBoxModel2.addElement("Depth");
        defaultComboBoxModel2.addElement("Random");
        defaultComboBoxModel2.addElement("Heuristic 01: Mannhatten's D");
        defaultComboBoxModel2.addElement("Heuristic 02: Euclidien's D");
        defaultComboBoxModel2.addElement("Heuristic 03: Hamming's D");
        solvingMethodeComboBox.setModel(defaultComboBoxModel2);
        solvingMethodeComboBox.setPreferredSize(new Dimension(230, 40));
        optionsPanel.add(solvingMethodeComboBox);
        runButton = new JButton();
        runButton.setBackground(new Color(-1));
        runButton.setMinimumSize(new Dimension(88, 40));
        runButton.setPreferredSize(new Dimension(88, 40));
        runButton.setText("Run");
        optionsPanel.add(runButton);
        clearButton = new JButton();
        clearButton.setBackground(new Color(-1));
        clearButton.setMinimumSize(new Dimension(88, 40));
        clearButton.setPreferredSize(new Dimension(88, 40));
        clearButton.setText("Clear");
        optionsPanel.add(clearButton);
        statsPanel = new JPanel();
        statsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        statsPanel.setMinimumSize(new Dimension(1100, 200));
        statsPanel.setPreferredSize(new Dimension(1100, 200));
        panel1.add(statsPanel, BorderLayout.SOUTH);
        final JScrollPane scrollPane1 = new JScrollPane();
        statsPanel.add(scrollPane1);
        statsTextPane = new JTextPane();
        statsTextPane.setBackground(new Color(-1));
        statsTextPane.setEditable(false);
        Font statsTextPaneFont = this.$$$getFont$$$("Courier New", -1, 14, statsTextPane.getFont());
        if (statsTextPaneFont != null) statsTextPane.setFont(statsTextPaneFont);
        statsTextPane.setMinimumSize(new Dimension(1050, 180));
        statsTextPane.setPreferredSize(new Dimension(1050, 180));
        statsTextPane.setText("");
        scrollPane1.setViewportView(statsTextPane);
        centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        centerPanel.setMinimumSize(new Dimension(1100, 300));
        centerPanel.setPreferredSize(new Dimension(1100, 300));
        panel1.add(centerPanel, BorderLayout.CENTER);
        necklacePanel = new JPanel();
        necklacePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
        necklacePanel.setMinimumSize(new Dimension(1000, 150));
        necklacePanel.setPreferredSize(new Dimension(1000, 150));
        centerPanel.add(necklacePanel);
        choosedMethode = new JPanel();
        choosedMethode.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 14));
        choosedMethode.setMinimumSize(new Dimension(1000, 50));
        choosedMethode.setPreferredSize(new Dimension(1000, 50));
        centerPanel.add(choosedMethode);
        solvingMethodeTextArea = new JTextArea();
        solvingMethodeTextArea.setBackground(new Color(-855310));
        solvingMethodeTextArea.setColumns(50);
        solvingMethodeTextArea.setDisabledTextColor(new Color(-16777216));
        solvingMethodeTextArea.setDoubleBuffered(true);
        solvingMethodeTextArea.setEditable(false);
        solvingMethodeTextArea.setEnabled(false);
        Font solvingMethodeTextAreaFont = this.$$$getFont$$$("Courier New", -1, 20, solvingMethodeTextArea.getFont());
        if (solvingMethodeTextAreaFont != null) solvingMethodeTextArea.setFont(solvingMethodeTextAreaFont);
        solvingMethodeTextArea.setLineWrap(false);
        solvingMethodeTextArea.setRows(1);
        solvingMethodeTextArea.setText("Solving Methode  :  ");
        choosedMethode.add(solvingMethodeTextArea);
        cuttedNecklacePanel = new JPanel();
        cuttedNecklacePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
        cuttedNecklacePanel.setMinimumSize(new Dimension(1000, 150));
        cuttedNecklacePanel.setName("hh");
        cuttedNecklacePanel.setPreferredSize(new Dimension(1000, 150));
        centerPanel.add(cuttedNecklacePanel);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
