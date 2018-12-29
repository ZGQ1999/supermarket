package com.soft1841.controller;

import com.soft1841.entity.VIP;
import com.soft1841.service.VIPService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class VIPController implements Initializable {
    //布局文件中的表格视图对象，用来显示数据库中读取的所有vip信息
    @FXML
    private TableView<VIP> vipTable;
    //布局文件中的输入文本框对象，用来输入搜索关键词
    @FXML
    private TextField keywordsField;
    //图书模型数据集合，可以实时相应数据变化，无需刷新
    private ObservableList<VIP> vipData = FXCollections.observableArrayList();
    //VIPService对象，从Service工厂通过静态方法获得
    private VIPService vipService = ServiceFactory.getVIPServiceInstance();
    //VIP实体集合，存放数据库图书表各种查询的结果
    private List<VIP> vipList = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTable();
    }

    //显示图书表格数据的方法
    private void showVIPData(List<VIP> vipList) {
        vipData.addAll(vipList);
        vipTable.setItems(vipData);
    }


    //表格初始化方法
    private void initTable() {
        //水平方向不显示滚动条，表格的列宽会均匀分布
        vipTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        //1.调用查询所有的方法，
        vipList = vipService.selectAllVIP();
        showVIPData(vipList);

    }

    //根据关键词搜索方法
    public void searchVIP() {
        vipTable.getItems().removeAll(vipData);
        //获得输入的查询关键字
        String keywords = keywordsField.getText().trim();
        vipList = vipService.getVIPLike(keywords);
        showVIPData(vipList);
    }

    public void enter(){ this.keywordsField.setText("");}
}





