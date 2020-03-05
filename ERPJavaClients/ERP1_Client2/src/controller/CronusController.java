package controller;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import application.Main;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import se.lu.ics.grupp14.ERP1WebServiceSoapProxy;
import se.lu.ics.grupp14.Employee;
import se.lu.ics.grupp14.GridViewContent;

public class CronusController implements Initializable {
	
	@FXML
	private TableView<GridViewContent> tableViewCronus;
	@FXML
	private ComboBox<String> comboBoxInformation;
	@FXML
	private TableColumn<GridViewContent, String> column1;
	@FXML
	private TableColumn<GridViewContent, String> column2;
	@FXML
	private TableColumn<GridViewContent, String> column3;
	@FXML
	private TableColumn<GridViewContent, String> column4;
	@FXML
	private TableColumn<GridViewContent, String> column5;
	@FXML
	private TableColumn<GridViewContent, String> column6;
	@FXML
	private RadioButton contentEmployeeRadBtn;
	@FXML
	private RadioButton metadataRadBtn;
	
	private Main main;
	
	ERP1WebServiceSoapProxy proxy = new ERP1WebServiceSoapProxy();
	
	ObservableList<GridViewContent> gridViewList;
	
	ObservableList<String> chooseInformation = FXCollections.observableArrayList("Employee", "Absence", "Portal Setup",
			"Qualification", "Relative", "Statistics Group" ,"Employee and Relatives", "Sick employees 2004", "Most absent employee");
	ObservableList<String> chooseMetadata = FXCollections.observableArrayList("All keys", "All Indexes", "All Table Constraints",
			"All tables", "Employee columns", "Employee Table", "Employee Absence", "Employee Portal Setup", "Employee Qualification", 
			"Employee Relatives", "Employee Statistics Group");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBoxInformation.setItems(chooseInformation);
		
		final ToggleGroup group = new ToggleGroup();
		metadataRadBtn.setToggleGroup(group);
		contentEmployeeRadBtn.setToggleGroup(group);
		contentEmployeeRadBtn.setSelected(true);
	}
	
	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	//initializes columns with tableModel and get all column names
	public void initColumns(GridViewContent gridViewInstance) {
		column1.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData1()));
		column2.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData2()));
		column3.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData3()));
		column4.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData4()));
		column5.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData5()));
		column6.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getColumnData6()));

		column1.setText(gridViewInstance.getColumnName1());
		column2.setText(gridViewInstance.getColumnName2());
		column3.setText(gridViewInstance.getColumnName3());
		column4.setText(gridViewInstance.getColumnName4());
		column5.setText(gridViewInstance.getColumnName5());
		column6.setText(gridViewInstance.getColumnName6());
	}
	
	//initializes tableView
	public void initData(ObservableList<GridViewContent> gridList) {
		gridViewList = gridList;		
		tableViewCronus.setItems(gridViewList);		
	}
	
	//Get gridViewContent
	public ObservableList<GridViewContent> getGridContentList(GridViewContent[] list) {
		return FXCollections.observableArrayList(Arrays.asList(list));
	}

	// Change view in list with selected radioButton of users choice
	public void radioSelect(ActionEvent event) {
		if(contentEmployeeRadBtn.isSelected()) {
			comboBoxInformation.setItems(chooseInformation);
			tableViewCronus.getItems().clear();
		} else if(metadataRadBtn.isSelected()) {
			comboBoxInformation.setItems(chooseMetadata);
			tableViewCronus.getItems().clear();
		}
	}

	@FXML
	public void comboBoxInformationChange(ActionEvent event) {
		String choose = comboBoxInformation.getValue();

		if (choose != null) {
			try {
				switch (choose) {
				case "Employee":
					GridViewContent gridContentemployee;
					ObservableList<GridViewContent> contentListEmployee = getGridContentList(proxy.getEmployeeInfo());
					gridContentemployee = contentListEmployee.get(0);
					initColumns(gridContentemployee);
					initData(contentListEmployee);
					break; 
				case "Absence":
					GridViewContent gridContentAbsence;
					ObservableList<GridViewContent> contentListAbsence = getGridContentList(proxy.getAbsenceInfo());
					gridContentAbsence = contentListAbsence.get(0);
					initColumns(gridContentAbsence);
					initData(contentListAbsence);
					break;
				case "Portal Setup":
					GridViewContent gridContentPortal;
					ObservableList<GridViewContent> contentListPortal = getGridContentList(proxy.getPortalInfo());
					gridContentPortal = contentListPortal.get(0);
					initColumns(gridContentPortal);
					initData(contentListPortal);
					break;
				case "Qualification":
					GridViewContent gridContentQualification;
					ObservableList<GridViewContent> contentListQualification = getGridContentList(proxy.getQualificationInfo());
					gridContentQualification = contentListQualification.get(0);
					initColumns(gridContentQualification);
					initData(contentListQualification);
					break;	
				case "Relative":
					GridViewContent gridContentRelative;
					ObservableList<GridViewContent> contentListRelative = getGridContentList(proxy.getRelativeInfo());
					gridContentRelative = contentListRelative.get(0);
					initColumns(gridContentRelative);
					initData(contentListRelative);
					break;	
				case "Statistics Group":
					GridViewContent gridContentStatisticsGroup;
					ObservableList<GridViewContent> contentListStatisticsGroup = getGridContentList(proxy.getStatisticsGroupInfo());
					gridContentStatisticsGroup = contentListStatisticsGroup.get(0);
					initColumns(gridContentStatisticsGroup);
					initData(contentListStatisticsGroup);
					break;
				case "Employee and Relatives":
					GridViewContent gridContentEmployeeRelatives;
					ObservableList<GridViewContent> contentListEmployeeRelatives = getGridContentList(proxy.getEmployeeRelativeInfo());
					gridContentEmployeeRelatives = contentListEmployeeRelatives.get(0);
					initColumns(gridContentEmployeeRelatives);
					initData(contentListEmployeeRelatives);
					break;	
				case "Sick employees 2004":
					GridViewContent gridContentSick2004;
					ObservableList<GridViewContent> contentListSick2004 = getGridContentList(proxy.getAbsence2004Info());
					gridContentSick2004 = contentListSick2004.get(0);
					initColumns(gridContentSick2004);
					initData(contentListSick2004);
					break;	
				case "Most absent employee":
					GridViewContent gridContentMostAbsentEmployee;
					ObservableList<GridViewContent> contentListMostAbsentEmployee = getGridContentList(proxy.mostAbsentEmployee());
					gridContentMostAbsentEmployee = contentListMostAbsentEmployee.get(0);
					initColumns(gridContentMostAbsentEmployee);
					initData(contentListMostAbsentEmployee);
					break;	
				case "All keys":
					GridViewContent gridContentAllKeys;
					ObservableList<GridViewContent> contentListAllKeys = getGridContentList(proxy.getAllKeys());
					gridContentAllKeys = contentListAllKeys.get(0);
					initColumns(gridContentAllKeys);
					initData(contentListAllKeys);
					break; 
				case "All Indexes":
					GridViewContent gridContentAllIndexes;
					ObservableList<GridViewContent> contentListAllIndexes = getGridContentList(proxy.getAllIndexes());
					gridContentAllIndexes = contentListAllIndexes.get(0);
					initColumns(gridContentAllIndexes);
					initData(contentListAllIndexes);
					break; 	
				case "All Table Constraints":
					GridViewContent gridContentAllTableConstraints;
					ObservableList<GridViewContent> contentListAllTableConstraints = getGridContentList(proxy.getAllConstraints());
					gridContentAllTableConstraints = contentListAllTableConstraints.get(0);
					initColumns(gridContentAllTableConstraints);
					initData(contentListAllTableConstraints);
					break; 
				case "All tables":
					GridViewContent gridContentAllTables;
					ObservableList<GridViewContent> contentListAllAllTables = getGridContentList(proxy.getAllTables());
					gridContentAllTables = contentListAllAllTables.get(0);
					initColumns(gridContentAllTables);
					initData(contentListAllAllTables);
					break; 
				case "Employee columns":
					GridViewContent gridContentEmployeeColumns;
					ObservableList<GridViewContent> contentListEmployeeColumns = getGridContentList(proxy.getAllColumns());
					gridContentEmployeeColumns = contentListEmployeeColumns.get(0);
					initColumns(gridContentEmployeeColumns);
					initData(contentListEmployeeColumns);
					break; 
				case "Employee Table":
					GridViewContent gridContentEmployeeTable;
					ObservableList<GridViewContent> contentListEmployeeTable = getGridContentList(proxy.getMetadataEmployee());
					gridContentEmployeeTable = contentListEmployeeTable.get(0);
					initColumns(gridContentEmployeeTable);
					initData(contentListEmployeeTable);
					break;	
				case "Employee Absence":
					GridViewContent gridContentEmployeeAbsence;
					ObservableList<GridViewContent> contentListEmployeeAbsence = getGridContentList(proxy.getMetadataAbsence());
					gridContentEmployeeAbsence = contentListEmployeeAbsence.get(0);
					initColumns(gridContentEmployeeAbsence);
					initData(contentListEmployeeAbsence);
					break;
				case "Employee Portal Setup":
					GridViewContent gridContentEmployeePortalSetup;
					ObservableList<GridViewContent> contentListEmployeePortalSetup = getGridContentList(proxy.getMetadataPortalSetup());
					gridContentEmployeePortalSetup = contentListEmployeePortalSetup.get(0);
					initColumns(gridContentEmployeePortalSetup);
					initData(contentListEmployeePortalSetup);
					break;
				case "Employee Qualification":
					GridViewContent gridContentEmployeeQualification;
					ObservableList<GridViewContent> contentListEmployeeQualification = getGridContentList(proxy.getMetadataQualification());
					gridContentEmployeeQualification = contentListEmployeeQualification.get(0);
					initColumns(gridContentEmployeeQualification);
					initData(contentListEmployeeQualification);
					break;	
				case "Employee Relatives":
					GridViewContent gridContentEmployeeRelativesMeta;
					ObservableList<GridViewContent> contentListEmployeeRelativesMeta = getGridContentList(proxy.getMetadataRelatives());
					gridContentEmployeeRelativesMeta = contentListEmployeeRelativesMeta.get(0);
					initColumns(gridContentEmployeeRelativesMeta);
					initData(contentListEmployeeRelativesMeta);
					break;	
				case "Employee Statistics Group":
					GridViewContent gridContentEmployeeStatisticsGroup;
					ObservableList<GridViewContent> contentListEmployeeStatisticsGroup = getGridContentList(proxy.getMetadataStatisticsGroup());
					gridContentEmployeeStatisticsGroup = contentListEmployeeStatisticsGroup.get(0);
					initColumns(gridContentEmployeeStatisticsGroup);
					initData(contentListEmployeeStatisticsGroup);
					break;		
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	public void btnGoBack(ActionEvent event) {
		this.main.navigate(Main.Pages.HOME);
	}
}
