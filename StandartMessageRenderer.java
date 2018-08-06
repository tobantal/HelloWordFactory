package HelloWordFactory;

public class StandartMessageRenderer implements MessageRenderer {

    private MessageProvider messgeProvider = null;

    public void render() {
        if (messgeProvider == null)
            throw new RuntimeException("You must set the property messageProvider of class: " +
                    StandartMessageRenderer.class.getName());
        System.out.println(messgeProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider messgeProvider) {
        this.messgeProvider = messgeProvider;
    }

    public MessageProvider getMessageProvider() {
        return messgeProvider;
    }
}