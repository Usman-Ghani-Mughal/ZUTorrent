
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usman Ghani Mughal
 */
public class main_frame extends javax.swing.JFrame {
    public File f2;
    static int n=0;
    public main_frame() {
        initComponents();
    }
    public main_frame(String s)
    {
        initComponents();
       
        jLabel3.setText(s);
    }
    public main_frame(int num)
    {
        initComponents();
        switch(num)
        {
            case 1:
            {
                this.getContentPane().setBackground(Color.white);
                break;
            }
            case 2:
            {
                this.getContentPane().setBackground(Color.red);
                break;
            }
            case 3:
            {
                this.getContentPane().setBackground(Color.blue);
                break;
            }
            case 4:
            {
                this.getContentPane().setBackground(Color.cyan);
                break;
            }
            case 5:
            {
                this.getContentPane().setBackground(Color.LIGHT_GRAY);
                break;
            }
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTorrent = new javax.swing.JButton();
        addTbyURl = new javax.swing.JButton();
        creatnewtorrent = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        num = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        meu = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchtext = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        downspeed = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZUTorrenting");
        setBackground(new java.awt.Color(250, 250, 250));

        addTorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-icon (2).png"))); // NOI18N
        addTorrent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N
        addTorrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTorrent(evt);
            }
        });

        addTbyURl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add-Folder-icon.png"))); // NOI18N
        addTbyURl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N
        addTbyURl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTbyURl(evt);
            }
        });

        creatnewtorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add-Folder-icon.png"))); // NOI18N
        creatnewtorrent.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        creatnewtorrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatnewtorrentActionPerformed(evt);
            }
        });

        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bin-icon.png"))); // NOI18N
        remove.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Start-icon.png"))); // NOI18N
        start.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop-Hot-icon.png"))); // NOI18N
        stop.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        num.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        num.setText("  #");
        num.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        nameText.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        nameText.setText("Name");
        nameText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        size.setFont(new java.awt.Font("Sitka Display", 1, 11)); // NOI18N
        size.setText("  Size");
        size.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        status.setFont(new java.awt.Font("Sitka Display", 1, 11)); // NOI18N
        status.setText("   Status");
        status.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        meu.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Toolbar-Downloads-icon.png"))); // NOI18N
        jButton3.setText("Torrent");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torrentFrame(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel21.setText("             WE WILL ADD ");

        jLabel22.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel22.setText("         OTHER OPTIONS HERE");

        jLabel23.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel23.setText("           IN NEXT VERSION");

        javax.swing.GroupLayout meuLayout = new javax.swing.GroupLayout(meu);
        meu.setLayout(meuLayout);
        meuLayout.setHorizontalGroup(
            meuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(meuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(meuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        meuLayout.setVerticalGroup(
            meuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meuLayout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        searchtext.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });

        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-button-green-icon.png"))); // NOI18N
        searchbutton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/14898.jpg"))); // NOI18N
        img.setText("jLabel7");

        downspeed.setFont(new java.awt.Font("Sitka Display", 1, 11)); // NOI18N
        downspeed.setText("   Down Speed");
        downspeed.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Write-Pencil-Mail-icon.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings-3-icon.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 11)); // NOI18N
        jLabel2.setText("seeds/peers");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(404, 0, 84, 23);

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(56, 0, 330, 23);

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel6.setText("     ");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 38, 23);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(498, 0, 98, 23);

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(602, 0, 95, 23);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(707, 0, 80, 23);

        jLabel9.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel9.setText("     ");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 29, 38, 23);

        jLabel10.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(56, 29, 330, 23);

        jLabel11.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(404, 29, 84, 23);

        jLabel12.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(498, 29, 98, 23);

        jLabel13.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(602, 29, 95, 23);

        jLabel14.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(707, 29, 80, 23);

        jLabel15.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel15.setText("     ");
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 58, 38, 19);

        jLabel16.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(56, 58, 330, 20);

        jLabel17.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(404, 58, 84, 20);

        jLabel18.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(498, 58, 98, 20);

        jLabel19.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel19);
        jLabel19.setBounds(602, 58, 95, 23);

        jLabel20.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(707, 58, 80, 23);

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setText("             Advertisng area");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 227, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Sitka Display", 0, 11)); // NOI18N
        jButton4.setText("Go Back To Menu");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu6.setText("File");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuDeselected(evt);
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder-add-icon.png"))); // NOI18N
        jMenuItem1.setText("Add Torrent by URL");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New-file-icon (1).png"))); // NOI18N
        jMenuItem2.setText(" Creat new Torrent");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-2-icon.png"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenu6.add(jMenuItem3);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("Options");
        jMenuBar3.add(jMenu7);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(628, 628, 628)
                                        .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(299, 299, 299)
                                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(680, 680, 680)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(addTbyURl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(creatnewtorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(735, 735, 735)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(477, 477, 477)
                                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(502, 502, 502)
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(607, 607, 607)
                                        .addComponent(downspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(401, 401, 401)
                                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(addTbyURl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(creatnewtorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(addTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(273, 273, 273)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(234, 234, 234)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(273, 273, 273)
                                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(234, 234, 234)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(163, 163, 163))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(234, 234, 234)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(336, 336, 336))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(downspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(302, 302, 302)))))
                            .addComponent(jButton4))))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addTorrent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTorrent
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        filename+=".torrent";
        try
        {
            f2 = new File(filename);
            f2.createNewFile();
            System.out.println("is exist "+f2.exists());
            if(f2.exists())
            {
                new SucessMade().setVisible(true);
            }
            
        }catch (IOException ex){}
        
        
    }//GEN-LAST:event_addTorrent

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PInformation("main").setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        this.setVisible(false);
        new PersonalizationClass().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addTbyURl(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTbyURl
        // TODO add your handling code here:
    }//GEN-LAST:event_addTbyURl

    private void creatnewtorrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatnewtorrentActionPerformed
        new CreateTorrent().setVisible(true);
    }//GEN-LAST:event_creatnewtorrentActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       
    }//GEN-LAST:event_removeActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
         this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_stopActionPerformed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void torrentFrame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torrentFrame
        new UrlFrame().setVisible(true);
    }//GEN-LAST:event_torrentFrame

    private void menu1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1
 //this.setVisible(false);
        new UrlFrame().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_menu1

    private void jMenu6MenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuDeselected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MenuDeselected

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new CreateTorrent().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    public static void pra(String s,double fs,String nam,int num,String spee)
    {
        fs=fs/1024;
        String pe  = String.format("%.2f", fs);
        String no = ""+num;
        s+=" %";
        pe+=" KB";
        spee+=" KB";
        jLabel3.setText(s);
        if(n==0)
        {
            jLabel4.setText(pe);
            jLabel5.setText(nam);
            jLabel6.setText(no);
            jLabel7.setText(spee);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTbyURl;
    private javax.swing.JButton addTorrent;
    private javax.swing.JButton creatnewtorrent;
    private javax.swing.JLabel downspeed;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private java.awt.Panel meu;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel num;
    private java.awt.Panel panel1;
    private javax.swing.JButton remove;
    private javax.swing.JButton searchbutton;
    public javax.swing.JTextField searchtext;
    private javax.swing.JLabel size;
    private javax.swing.JButton start;
    private javax.swing.JLabel status;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

}
