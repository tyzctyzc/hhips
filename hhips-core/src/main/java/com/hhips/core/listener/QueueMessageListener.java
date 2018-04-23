package com.hhips.core.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 名称：QueueMessageListener<br>
 * <p>
 * 描述：Queue消息消费者监听器<br>
 *
 */
public class QueueMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        try {
            System.out.println("Queue消息接收者，收到消息内容：" + textMsg.getText());
            System.out.println("Queue消息接收成功！开始调用并执行service方法...");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
