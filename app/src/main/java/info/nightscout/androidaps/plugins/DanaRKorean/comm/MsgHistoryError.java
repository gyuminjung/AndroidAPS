package info.nightscout.androidaps.plugins.DanaRKorean.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mike on 20.07.2016.
 */
public class MsgHistoryError extends MsgHistoryAll {
    private static Logger log = LoggerFactory.getLogger(MsgHistoryError.class);
    public MsgHistoryError() {
        SetCommand(0x3106);
    }
    // Handle message taken from MsgHistoryAll
}
