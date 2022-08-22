

package com.mycompany.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class TelaAdmin extends JFrame implements ActionListener {
    Container container;
    JPanel cimaPanel = new JPanel();
    JLabel titleLabel = new JLabel("SGVF"); JPanel opcaoPanel = new JPanel(); JLabel opcaoEscolhidaLabel = new JLabel("Início");

    JPanel baixoPanel = new JPanel();
    JButton exitButton = new JButton("Sair"); JLabel exitVazioLabel = new JLabel();

    JPanel esquerdoPanel = new JPanel();
    JLabel labelVazioCima = new JLabel(); JLabel labelVazioBaixo = new JLabel();
    //Dados do do painel dos botoes (dentro do painel esquerdo)
    JPanel buttonPanel = new JPanel();
    JButton homeButton = new JButton("Início"); JLabel labelVazioHome = new JLabel(); JButton addButton = new JButton("Adicionar");
    JButton updateButton = new JButton("Atualizar"); JButton removeButton = new JButton("Excluir"); JLabel labelVazioHelp = new JLabel();
    JButton searchButton = new JButton("Procurar"); JButton managementButton = new JButton("Gestão");
    JButton helpButton = new JButton("Ajuda"); JButton myAccountButton = new JButton("Dalton Viriato");


    JPanel panelCentral = new JPanel();
    CardLayout cardLayout = new CardLayout();

    JPanel firstHomePanel = new JPanel();
    JButton produtoVendidoMesHomeButton = new JButton("Produtos Vendidos (Mês)"); JLabel quantidadeProdutoVendidoHomeLabel = new JLabel("104");
    JButton produtoSemStockHomeButton = new JButton("Produtos Sem Stock"); JLabel quantidadeProdutoSemStockHomeLabel = new JLabel("14");
    JPanel secondHomePanel = new JPanel();
    JButton produtoCadastradoHomeButton = new JButton("Produtos Cadastrados"); JLabel produtoCadastradoHomeLabel = new JLabel("723");
    JButton monetizacaoHomeButton = new JButton("Receita"); JLabel monetizacaoHomeLabel = new JLabel("3060 MZN");

    JPanel firstAddPanel = new JPanel();
    JButton addProdutoButton = new JButton("Cadastrar Produto"); JLabel quantidadeProdutoAddLabel = new JLabel("205");
    JButton addFornecedorButton = new JButton("Cadastrar Fornecedor"); JLabel quantidadeFornecedorAddLabel = new JLabel("07");
    JPanel secondAddPanel = new JPanel();
    JButton addVendedorButton = new JButton("Cadastrar Vendedor"); JLabel quantidadeVendedorAddLabel = new JLabel("13");
    JButton addClienteButton = new JButton("Cadastrar Cliente"); JLabel quantidadeClienteAddLabel = new JLabel("64");

    JPanel firstUpdatePanel = new JPanel();
    JButton updateProdutoButton = new JButton("Atualizar Produto"); JLabel quantidadeProdutoUpdateLabel = new JLabel("205");
    JButton updateFornecedorButton = new JButton("Atualizar Fornecedor"); JLabel quantidadeFornecedorUpdateLabel = new JLabel("07");
    JPanel secondUpdatePanel = new JPanel();
    JButton updateVendedorButton = new JButton("Atualizar Vendedor"); JLabel quantidadeVendedorUpdateLabel = new JLabel("13");
    JButton UpdateClienteButton = new JButton("Atualizar Cliente"); JLabel quantidadeClienteUpdateLabel = new JLabel("64");

    JPanel firstDeletePanel = new JPanel();
    JButton deleteProdutoButton = new JButton("Excluir Produto"); JLabel quantidadeProdutoDeleteLabel = new JLabel("205");
    JButton deleteFornecedorButton = new JButton("Excluir Fornecedor"); JLabel quantidadeFornecedorDeleteLabel = new JLabel("07");
    JPanel secondDeletePanel = new JPanel();
    JButton deleteVendedorButton = new JButton("Excluir Vendedor"); JLabel quantidadeVendedorDeleteLabel = new JLabel("13");
    JButton deleteClienteButton = new JButton("Excluir Cliente"); JLabel quantidadeClienteDeleteLabel = new JLabel("47");

    JPanel firstSearchPanel = new JPanel();
    JButton searchProdutoButton = new JButton("Pesquisar Produtos"); JLabel quantidadeProdutoSearchLabel = new JLabel("205");
    JButton searchFornecedorButton = new JButton("Pesquisar Fornecedores"); JLabel quantidadeFornecedorSearchLabel = new JLabel("07");
    JPanel secondSearchPanel = new JPanel();
    JButton searchVendedorButton = new JButton("Pesquisar Vendedores"); JLabel quantidadeVendedorSearchLabel = new JLabel("13");
    JButton searchClienteButton = new JButton("Pesquisar Clientes"); JLabel quantidadeClienteSearchLabel = new JLabel("47");

    Color azul = new Color(20,126,203);
    Color creme = new Color(237,236,236);
    Color cizentoEscuro = new Color(49,64,77);
    Color vermelho = new Color(223,0,36);

    TelaAdmin(){
        super("Sistema de Gestão da Ferragem - Gestor");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(920,590);
        setMinimumSize(new Dimension(500,580));
        setLocationRelativeTo(null);
        container = getContentPane();
        container.setLayout(new BorderLayout(1,0));

        cimaPanel.setBackground(Color.white);
        cimaPanel.setPreferredSize(new Dimension(30,40));
        cimaPanel.setLayout(new BorderLayout(15,0));

        titleLabel.setForeground(Color.white);
        titleLabel.setOpaque(true);
        titleLabel.setBackground(azul);
        titleLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/martelo.png"),30,25));
        titleLabel.setFont(new Font("Verdana",Font.BOLD,19));
        titleLabel.setPreferredSize(new Dimension(200,30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cimaPanel.add(titleLabel,BorderLayout.WEST);

        opcaoPanel.setBackground(Color.BLUE);
        opcaoPanel.setLayout(new BorderLayout());
        opcaoPanel.setBackground(Color.white);
        cimaPanel.add(opcaoPanel);

        opcaoEscolhidaLabel.setForeground(Color.black);
        opcaoEscolhidaLabel.setOpaque(true);
        opcaoEscolhidaLabel.setBackground(Color.white);
        opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/home.png"),35,30));
        opcaoEscolhidaLabel.setFont(new Font("Monospaced",Font.PLAIN,19));
        opcaoEscolhidaLabel.setHorizontalAlignment(SwingConstants.LEFT);
        opcaoPanel.add(opcaoEscolhidaLabel,BorderLayout.WEST);

        //Dados do Painel esquerdo
        labelVazioCima.setPreferredSize(new Dimension(125,5));
        esquerdoPanel.add(labelVazioCima);

        labelVazioBaixo.setPreferredSize(new Dimension(125,10));
        esquerdoPanel.add(labelVazioBaixo);

        //Dados dos painel de botoes (este painel esta dentro do painel Esquerdo)
        homeButton.setBackground(cizentoEscuro);
        homeButton.setForeground(Color.white);
        homeButton.setPreferredSize(new Dimension(125,30));
        homeButton.setFocusable(false);
        homeButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/home.png"),20,20));
        homeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        homeButton.setHorizontalAlignment(SwingConstants.LEFT);
        labelVazioHome.setPreferredSize(new Dimension(125,20));
        buttonPanel.add(homeButton);
        buttonPanel.add(labelVazioHome);

        addButton.setBackground(cizentoEscuro); addButton.setForeground(Color.white);
        addButton.setPreferredSize(new Dimension(125,30));
        addButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/add.png"),20,20));
        addButton.setFocusable(false);
        addButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(addButton);

        updateButton.setBackground(cizentoEscuro);
        updateButton.setForeground(Color.white);
        updateButton.setPreferredSize(new Dimension(125,30));
        updateButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/update.png"),20,20));
        updateButton.setFocusable(false);
        updateButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        updateButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(updateButton);

        removeButton.setBackground(cizentoEscuro);
        removeButton.setForeground(Color.white);
        removeButton.setPreferredSize(new Dimension(125,30));
        removeButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/remove.png"),20,20));
        removeButton.setFocusable(false);
        removeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        removeButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(removeButton);
        labelVazioHelp.setPreferredSize(new Dimension(125,20));
        buttonPanel.add(labelVazioHelp);

        searchButton.setBackground(cizentoEscuro);
        searchButton.setForeground(Color.white);
        searchButton.setPreferredSize(new Dimension(125,30));
        searchButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/search.png"),20,20));
        searchButton.setFocusable(false);
        searchButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        searchButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(searchButton);

        managementButton.setBackground(cizentoEscuro);
        managementButton.setForeground(Color.white);
        managementButton.setPreferredSize(new Dimension(125,30));
        managementButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/management.png"),20,20));
        managementButton.setFocusable(false);
        managementButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        managementButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(managementButton);

        helpButton.setBackground(cizentoEscuro);
        helpButton.setForeground(Color.white);
        helpButton.setPreferredSize(new Dimension(125,30));
        helpButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/help.png"),20,20));
        helpButton.setFocusable(false);
        helpButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        helpButton.setHorizontalAlignment(SwingConstants.LEFT);
        buttonPanel.add(helpButton);

        buttonPanel.setPreferredSize(new Dimension(125,355));
        buttonPanel.setBackground(cizentoEscuro);
        esquerdoPanel.add(buttonPanel);

        myAccountButton.setBackground(cizentoEscuro);
        myAccountButton.setForeground(Color.white);
        myAccountButton.setFont(new Font("Verdana",Font.BOLD,12));
        myAccountButton.setPreferredSize(new Dimension(125,62));
        myAccountButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/myAccount.png"),35,30));
        myAccountButton.setFocusable(false);
        myAccountButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        myAccountButton.setHorizontalTextPosition(SwingConstants.CENTER);
        myAccountButton.setVerticalAlignment(SwingConstants.TOP);
        myAccountButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        esquerdoPanel.add(myAccountButton);

        esquerdoPanel.setBackground(cizentoEscuro);
        esquerdoPanel.setBorder(BorderFactory.createLineBorder(cizentoEscuro));
        esquerdoPanel.setPreferredSize(new Dimension(200,125));

        //Dados do painel central
        panelCentral.setLayout(cardLayout);

        panelCentral.add(panelHome(),"home");
        panelCentral.add(panelAdd(),"add");
        panelCentral.add(panelUpdate(),"update");
        panelCentral.add(panelDelete(),"delete");
        panelCentral.add(panelSearch(),"search");
        cardLayout.show(panelCentral,"home");

        //Dados Painel de Baixo
        exitButton.setFocusable(false);
        exitButton.setBackground(vermelho);
        exitButton.setPreferredSize(new Dimension(100,30));
        exitButton.setForeground(Color.white);
        exitButton.setIcon(resize(new ImageIcon("Imagens/Admin/Button/exit.png"),30,30));
        exitButton.setFont(new Font("Times New Roman",Font.BOLD,15));
        baixoPanel.setLayout(new BorderLayout());
        baixoPanel.add(exitVazioLabel, BorderLayout.WEST);
        baixoPanel.add(exitButton,BorderLayout.EAST);

        baixoPanel.setPreferredSize(new Dimension(200,40));
        baixoPanel.setBackground(cizentoEscuro);

        homeButton.addActionListener(this);
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        removeButton.addActionListener(this);
        searchButton.addActionListener(this);
        managementButton.addActionListener(this);
        helpButton.addActionListener(this);
        myAccountButton.addActionListener(this);

        addWindowStateListener(e -> {
            boolean isMaximized = isMaximized(e.getNewState());
            boolean wasMaximized = isMaximized(e.getOldState());


            boolean isMaxVert = isMaximizedVert(e.getNewState());
            boolean wasMaxVert = isMaximizedVert(e.getOldState());
            if(isMaximized){
                buttonPanel.setPreferredSize(new Dimension(125,525));
                //setSize(900,591);
            }
            else if (wasMaximized){
                buttonPanel.setPreferredSize(new Dimension(125,355));
                //Serve para "desatualizar o myAccount Button" quando a jenela reduz o tamanho(minimiza)
                //setSize(900,591);
            }

           else if(isMaxVert){
                buttonPanel.setPreferredSize(new Dimension(125,525));
                //setSize(900,590);
            }
            else if (wasMaxVert){
                buttonPanel.setPreferredSize(new Dimension(125,410));
                //Serve para "desatualizar o myAccount Button" quando a jenela reduz o tamanho(minimiza)
                setSize(900,592);
            }
            //Esse setSize serve para atualizar os componentes, sem ele oscomponentes não serão mostrados ao usarmos o WindowStateListener
            //setSize(900,590);
        });

        container.add(cimaPanel,BorderLayout.NORTH);
        container.add(esquerdoPanel,BorderLayout.WEST);
        container.add(panelCentral,BorderLayout.CENTER);
        container.add(baixoPanel,BorderLayout.SOUTH);
        container.setBackground(Color.white);
        setVisible(true);

    }
    private JPanel panelHome(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        firstHomePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        produtoVendidoMesHomeButton.setPreferredSize(new Dimension(320,130));
        produtoVendidoMesHomeButton.setLayout(new FlowLayout());
        produtoVendidoMesHomeButton.setBackground(Color.white);
        produtoVendidoMesHomeButton.setVerticalAlignment(SwingConstants.EAST);
        produtoVendidoMesHomeButton.setForeground(azul);
        quantidadeProdutoVendidoHomeLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/home/sold.png"),80,80));
        quantidadeProdutoVendidoHomeLabel.setFont(new Font("Circe",Font.BOLD,40));
        quantidadeProdutoVendidoHomeLabel.setForeground(azul);
        produtoVendidoMesHomeButton.add(quantidadeProdutoVendidoHomeLabel);
        produtoVendidoMesHomeButton.setFocusable(false);
        firstHomePanel.add(produtoVendidoMesHomeButton);

        produtoSemStockHomeButton.setPreferredSize(new Dimension(320,130));
        produtoSemStockHomeButton.setLayout(new FlowLayout());
        produtoSemStockHomeButton.setBackground(Color.white);
        produtoSemStockHomeButton.setVerticalAlignment(SwingConstants.EAST);
        produtoSemStockHomeButton.setForeground(azul);
        quantidadeProdutoSemStockHomeLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/home/emptybox.png"),80,80));
        quantidadeProdutoSemStockHomeLabel.setFont(new Font("Circe",Font.BOLD,40));
        quantidadeProdutoSemStockHomeLabel.setForeground(azul);
        produtoSemStockHomeButton.add(quantidadeProdutoSemStockHomeLabel);
        produtoSemStockHomeButton.setFocusable(false);
        firstHomePanel.add(produtoSemStockHomeButton);

        secondHomePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        produtoCadastradoHomeButton.setPreferredSize(new Dimension(320,130));
        produtoCadastradoHomeButton.setLayout(new FlowLayout());
        produtoCadastradoHomeButton.setFocusable(false);
        produtoCadastradoHomeButton.setBackground(Color.white);
        produtoCadastradoHomeButton.setVerticalAlignment(SwingConstants.EAST);
        produtoCadastradoHomeButton.setForeground(azul);
        produtoCadastradoHomeLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/home/produtoCadastrado.png"),80,80));
        produtoCadastradoHomeLabel.setFont(new Font("Circe",Font.BOLD,40));
        produtoCadastradoHomeLabel.setForeground(azul);
        produtoCadastradoHomeButton.add(produtoCadastradoHomeLabel);
        secondHomePanel.add(produtoCadastradoHomeButton);

        monetizacaoHomeButton.setPreferredSize(new Dimension(320,130));
        monetizacaoHomeButton.setLayout(new FlowLayout());
        monetizacaoHomeButton.setFocusable(false);
        monetizacaoHomeButton.setBackground(Color.white);
        monetizacaoHomeButton.setVerticalAlignment(SwingConstants.EAST);
        monetizacaoHomeButton.setForeground(azul);
        monetizacaoHomeLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/home/monetizacao.png"),80,80));
        monetizacaoHomeLabel.setFont(new Font("Circe",Font.BOLD,25));
        monetizacaoHomeLabel.setForeground(azul);
        monetizacaoHomeButton.add(monetizacaoHomeLabel);
        secondHomePanel.add(monetizacaoHomeButton);

        panel.add(firstHomePanel);
        panel.add(secondHomePanel);
        panel.setBackground(creme);
        panel.setBorder(BorderFactory.createLineBorder(creme));
        return panel;
    }
    private JPanel panelAdd(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        firstAddPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        addProdutoButton.setPreferredSize(new Dimension(320,130));
        addProdutoButton.setLayout(new FlowLayout());
        addProdutoButton.setBackground(Color.white);
        addProdutoButton.setVerticalAlignment(SwingConstants.EAST);
        addProdutoButton.setForeground(azul);
        quantidadeProdutoAddLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/add/produto.png"),80,80));
        quantidadeProdutoAddLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeProdutoAddLabel.setForeground(azul);
        addProdutoButton.add(quantidadeProdutoAddLabel);
        addProdutoButton.setFocusable(false);
        firstAddPanel.add(addProdutoButton);

        addFornecedorButton.setPreferredSize(new Dimension(320,130));
        addFornecedorButton.setLayout(new FlowLayout());
        addFornecedorButton.setBackground(Color.white);
        addFornecedorButton.setVerticalAlignment(SwingConstants.EAST);
        addFornecedorButton.setForeground(azul);
        quantidadeFornecedorAddLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/add/fornecedor.png"),80,80));
        quantidadeFornecedorAddLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeFornecedorAddLabel.setForeground(azul);
        addFornecedorButton.add(quantidadeFornecedorAddLabel);
        addFornecedorButton.setFocusable(false);
        firstAddPanel.add(addFornecedorButton);

        secondAddPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        addVendedorButton.setPreferredSize(new Dimension(320,130));
        addVendedorButton.setLayout(new FlowLayout());
        addVendedorButton.setFocusable(false);
        addVendedorButton.setBackground(Color.white);
        addVendedorButton.setVerticalAlignment(SwingConstants.EAST);
        addVendedorButton.setForeground(azul);
        quantidadeVendedorAddLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/add/funcionario1.png"),80,80));
        quantidadeVendedorAddLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeVendedorAddLabel.setForeground(azul);
        addVendedorButton.add(quantidadeVendedorAddLabel);
        secondAddPanel.add(addVendedorButton);

        addClienteButton.setPreferredSize(new Dimension(320,130));
        addClienteButton.setLayout(new FlowLayout());
        addClienteButton.setFocusable(false);
        addClienteButton.setBackground(Color.white);
        addClienteButton.setVerticalAlignment(SwingConstants.EAST);
        addClienteButton.setForeground(azul);
        quantidadeClienteAddLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/add/cliente.png"),80,80));
        quantidadeClienteAddLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeClienteAddLabel.setForeground(azul);
        addClienteButton.add(quantidadeClienteAddLabel);
        secondAddPanel.add(addClienteButton);

        panel.add(firstAddPanel);
        panel.add(secondAddPanel);
        panel.setBackground(creme);
        panel.setBorder(BorderFactory.createLineBorder(creme));
        return panel;
    }
    private JPanel panelUpdate(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        firstUpdatePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        updateProdutoButton.setPreferredSize(new Dimension(320,130));
        updateProdutoButton.setLayout(new FlowLayout());
        updateProdutoButton.setBackground(Color.white);
        updateProdutoButton.setVerticalAlignment(SwingConstants.EAST);
        updateProdutoButton.setForeground(azul);
        quantidadeProdutoUpdateLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/update/produto.png"),80,80));
        quantidadeProdutoUpdateLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeProdutoUpdateLabel.setForeground(azul);
        updateProdutoButton.add(quantidadeProdutoUpdateLabel);
        updateProdutoButton.setFocusable(false);
        firstUpdatePanel.add(updateProdutoButton);

        updateFornecedorButton.setPreferredSize(new Dimension(320,130));
        updateFornecedorButton.setLayout(new FlowLayout());
        updateFornecedorButton.setBackground(Color.white);
        updateFornecedorButton.setVerticalAlignment(SwingConstants.EAST);
        updateFornecedorButton.setForeground(azul);
        quantidadeFornecedorUpdateLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/update/fornecedor.png"),80,80));
        quantidadeFornecedorUpdateLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeFornecedorUpdateLabel.setForeground(azul);
        updateFornecedorButton.add(quantidadeFornecedorUpdateLabel);
        updateFornecedorButton.setFocusable(false);
        firstUpdatePanel.add(updateFornecedorButton);

        secondUpdatePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        updateVendedorButton.setPreferredSize(new Dimension(320,130));
        updateVendedorButton.setLayout(new FlowLayout());
        updateVendedorButton.setFocusable(false);
        updateVendedorButton.setBackground(Color.white);
        updateVendedorButton.setVerticalAlignment(SwingConstants.EAST);
        updateVendedorButton.setForeground(azul);
        quantidadeVendedorUpdateLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/update/funcionario.png"),80,80));
        quantidadeVendedorUpdateLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeVendedorUpdateLabel.setForeground(azul);
        updateVendedorButton.add(quantidadeVendedorUpdateLabel);
        secondUpdatePanel.add(updateVendedorButton);

        UpdateClienteButton.setPreferredSize(new Dimension(320,130));
        UpdateClienteButton.setLayout(new FlowLayout());
        UpdateClienteButton.setFocusable(false);
        UpdateClienteButton.setBackground(Color.white);
        UpdateClienteButton.setVerticalAlignment(SwingConstants.EAST);
        UpdateClienteButton.setForeground(azul);
        quantidadeClienteUpdateLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/update/cliente.png"),80,80));
        quantidadeClienteUpdateLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeClienteUpdateLabel.setForeground(azul);
        UpdateClienteButton.add(quantidadeClienteUpdateLabel);
        secondUpdatePanel.add(UpdateClienteButton);

        panel.add(firstUpdatePanel);
        panel.add(secondUpdatePanel);
        panel.setBackground(creme);
        panel.setBorder(BorderFactory.createLineBorder(creme));
        return panel;
    }
    private JPanel panelDelete(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        firstDeletePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        deleteProdutoButton.setPreferredSize(new Dimension(320,130));
        deleteProdutoButton.setLayout(new FlowLayout());
        deleteProdutoButton.setBackground(Color.white);
        deleteProdutoButton.setVerticalAlignment(SwingConstants.EAST);
        deleteProdutoButton.setForeground(azul);
        quantidadeProdutoDeleteLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/produto.png"),80,80));
        quantidadeProdutoDeleteLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeProdutoDeleteLabel.setForeground(azul);
        deleteProdutoButton.add(quantidadeProdutoDeleteLabel);
        deleteProdutoButton.setFocusable(false);
        firstDeletePanel.add(deleteProdutoButton);

        deleteFornecedorButton.setPreferredSize(new Dimension(320,130));
        deleteFornecedorButton.setLayout(new FlowLayout());
        deleteFornecedorButton.setBackground(Color.white);
        deleteFornecedorButton.setVerticalAlignment(SwingConstants.EAST);
        deleteFornecedorButton.setForeground(azul);
        quantidadeFornecedorDeleteLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/fornecedor.png"),80,80));
        quantidadeFornecedorDeleteLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeFornecedorDeleteLabel.setForeground(azul);
        deleteFornecedorButton.add(quantidadeFornecedorDeleteLabel);
        deleteFornecedorButton.setFocusable(false);
        firstDeletePanel.add(deleteFornecedorButton);

        secondDeletePanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        deleteVendedorButton.setPreferredSize(new Dimension(320,130));
        deleteVendedorButton.setLayout(new FlowLayout());
        deleteVendedorButton.setFocusable(false);
        deleteVendedorButton.setBackground(Color.white);
        deleteVendedorButton.setVerticalAlignment(SwingConstants.EAST);
        deleteVendedorButton.setForeground(azul);
        quantidadeVendedorDeleteLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/funcionario.png"),80,80));
        quantidadeVendedorDeleteLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeVendedorDeleteLabel.setForeground(azul);
        deleteVendedorButton.add(quantidadeVendedorDeleteLabel);
        secondDeletePanel.add(deleteVendedorButton);

        deleteClienteButton.setPreferredSize(new Dimension(320,130));
        deleteClienteButton.setLayout(new FlowLayout());
        deleteClienteButton.setFocusable(false);
        deleteClienteButton.setBackground(Color.white);
        deleteClienteButton.setVerticalAlignment(SwingConstants.EAST);
        deleteClienteButton.setForeground(azul);
        quantidadeClienteDeleteLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/cliente.png"),80,80));
        quantidadeClienteDeleteLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeClienteDeleteLabel.setForeground(azul);
        deleteClienteButton.add(quantidadeClienteDeleteLabel);
        secondDeletePanel.add(deleteClienteButton);

        panel.add(firstDeletePanel);
        panel.add(secondDeletePanel);
        panel.setBackground(creme);
        panel.setBorder(BorderFactory.createLineBorder(creme));
        return panel;
    }
    private JPanel panelSearch(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        firstSearchPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        searchProdutoButton.setPreferredSize(new Dimension(320,130));
        searchProdutoButton.setLayout(new FlowLayout());
        searchProdutoButton.setBackground(Color.white);
        searchProdutoButton.setVerticalAlignment(SwingConstants.EAST);
        searchProdutoButton.setForeground(azul);
        quantidadeProdutoSearchLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/produto.png"),80,80));
        quantidadeProdutoSearchLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeProdutoSearchLabel.setForeground(azul);
        searchProdutoButton.add(quantidadeProdutoSearchLabel);
        searchProdutoButton.setFocusable(false);
        firstSearchPanel.add(searchProdutoButton);

        searchFornecedorButton.setPreferredSize(new Dimension(320,130));
        searchFornecedorButton.setLayout(new FlowLayout());
        searchFornecedorButton.setBackground(Color.white);
        searchFornecedorButton.setVerticalAlignment(SwingConstants.EAST);
        searchFornecedorButton.setForeground(azul);
        quantidadeFornecedorSearchLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/fornecedor.png"),80,80));
        quantidadeFornecedorSearchLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeFornecedorSearchLabel.setForeground(azul);
        searchFornecedorButton.add(quantidadeFornecedorSearchLabel);
        searchFornecedorButton.setFocusable(false);
        firstSearchPanel.add(searchFornecedorButton);

        secondSearchPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        searchVendedorButton.setPreferredSize(new Dimension(320,130));
        searchVendedorButton.setLayout(new FlowLayout());
        searchVendedorButton.setFocusable(false);
        searchVendedorButton.setBackground(Color.white);
        searchVendedorButton.setVerticalAlignment(SwingConstants.EAST);
        searchVendedorButton.setForeground(azul);
        quantidadeVendedorSearchLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/funcionario.png"),80,80));
        quantidadeVendedorSearchLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeVendedorSearchLabel.setForeground(azul);
        searchVendedorButton.add(quantidadeVendedorSearchLabel);
        secondSearchPanel.add(searchVendedorButton);

        searchClienteButton.setPreferredSize(new Dimension(320,130));
        searchClienteButton.setLayout(new FlowLayout());
        searchClienteButton.setFocusable(false);
        searchClienteButton.setBackground(Color.white);
        searchClienteButton.setVerticalAlignment(SwingConstants.EAST);
        searchClienteButton.setForeground(azul);
        quantidadeClienteSearchLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Painel/Button/delete/cliente.png"),80,80));
        quantidadeClienteSearchLabel.setFont(new Font("Circe",Font.BOLD,20));
        quantidadeClienteSearchLabel.setForeground(azul);
        searchClienteButton.add(quantidadeClienteSearchLabel);
        secondSearchPanel.add(searchClienteButton);

        panel.add(firstSearchPanel);
        panel.add(secondSearchPanel);
        panel.setBackground(creme);
        panel.setBorder(BorderFactory.createLineBorder(creme));
        return panel;
    }

    private static boolean isMaximized(int state){
        return (state & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH;
    }
    private static boolean isMaximizedVert(int state){
        return (state & Frame.MAXIMIZED_VERT) == Frame.MAXIMIZED_VERT;
    }
    public static ImageIcon resize(ImageIcon im,int w, int h){
        BufferedImage bi = new BufferedImage(w,h,BufferedImage.TRANSLUCENT);
        Graphics2D gd = bi.createGraphics();
        gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        gd.drawImage(im.getImage(),0,0,w,h,null);
        gd.dispose();
        return  new ImageIcon(bi);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object clicked = e.getSource();
        if(clicked==homeButton){
            opcaoEscolhidaLabel.setText("Início");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/home.png"),35,30));
            cardLayout.show(panelCentral,"home");
        }
        if(clicked==addButton){
            opcaoEscolhidaLabel.setText("Adicionar");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/add.png"),35,30));
            cardLayout.show(panelCentral,"add");
        }
        if(clicked==updateButton){
            opcaoEscolhidaLabel.setText("Atualizar");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/update.png"),35,30));
            cardLayout.show(panelCentral,"update");
        }
        if(clicked==removeButton){
            opcaoEscolhidaLabel.setText("Excluir");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/remove.png"),35,30));
            cardLayout.show(panelCentral,"delete");
        }
        if(clicked==searchButton){
            opcaoEscolhidaLabel.setText("Procurar");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/search.png"),30,25));
            cardLayout.show(panelCentral,"search");
        }
        if(clicked==managementButton){
            opcaoEscolhidaLabel.setText("Gestão");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/management.png"),30,25));
        }
        if(clicked==helpButton){
            opcaoEscolhidaLabel.setText("Ajuda");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/help.png"),30,25));
        }
        if(clicked==myAccountButton){
            opcaoEscolhidaLabel.setText("Minha Conta");
            opcaoEscolhidaLabel.setIcon(resize(new ImageIcon("Imagens/Admin/Label/myAccount.png"),30,25));
        }
    }

}

