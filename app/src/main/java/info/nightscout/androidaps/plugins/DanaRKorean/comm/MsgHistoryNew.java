package info.nightscout.androidaps.plugins.DanaRKorean.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mike on 20.07.2016.
 */
public class MsgHistoryNew extends MsgHistoryAll {
    private static Logger log = LoggerFactory.getLogger(MsgHistoryNew.class);
    public MsgHistoryNew() {
        SetCommand(0x42F2);
    }
    // Handle message taken from MsgHistoryAll
}
