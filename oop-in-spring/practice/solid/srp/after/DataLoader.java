public class DataLoader {
    public Data loadHtml() {
        HttpClient client = new HttpClient();
        client.connect(url);
        return client.getResponse();
    }

    private void updateGui(Data data) {
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(Data data) {
        // ... 파싱 처리 코듸
    }
}