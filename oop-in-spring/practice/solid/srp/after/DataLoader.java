public class DataLoader {
    public Data loadHtml() {
        SocketClient client = new SocketClient();
        client.connect(server, port);
        return client.read();
    }

    private void updateGui(Data data) {
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(Data data) {
        // ... 파싱 처리 코듸
    }
}