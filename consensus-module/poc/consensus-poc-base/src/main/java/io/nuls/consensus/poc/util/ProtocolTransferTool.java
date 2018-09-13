package io.nuls.consensus.poc.util;

import io.nuls.consensus.poc.model.BlockExtendsData;
import io.nuls.core.tools.log.Log;
import io.nuls.kernel.model.BlockHeader;
import io.nuls.protocol.base.version.ProtocolContainer;
import io.nuls.protocol.storage.po.BlockProtocolInfoPo;
import io.nuls.protocol.storage.po.ProtocolInfoPo;
import io.nuls.protocol.storage.po.ProtocolTempInfoPo;

public class ProtocolTransferTool {

    public static ProtocolInfoPo toProtocolInfoPo(ProtocolContainer container) {
        ProtocolInfoPo infoPo = new ProtocolInfoPo();
        infoPo.setVersion(container.getVersion());
        infoPo.setPercent(container.getPercent());
        infoPo.setDelay(container.getDelay());
        infoPo.setCurrentDelay(container.getCurrentDelay());
        infoPo.setAddressSet(container.getAddressSet());
        infoPo.setStatus(container.getStatus());
        infoPo.setRoundIndex(container.getRoundIndex());
        return infoPo;
    }

    public static ProtocolTempInfoPo createProtocolTempInfoPo(BlockExtendsData extendsData) {
        ProtocolTempInfoPo infoPo = new ProtocolTempInfoPo();
        infoPo.setVersion(extendsData.getCurrentVersion());
        infoPo.setDelay(extendsData.getDelay());
        infoPo.setPercent(extendsData.getPercent());
        return infoPo;
    }


    public static BlockProtocolInfoPo toBlockProtocolInfoPo(BlockHeader header, ProtocolContainer container) {
        BlockProtocolInfoPo infoPo = new BlockProtocolInfoPo();
        infoPo.setBlockHeight(header.getHeight());
        infoPo.setVersion(container.getVersion());
        infoPo.setCurrentDelay(container.getCurrentDelay());
        infoPo.setEffectiveHeight(container.getEffectiveHeight());
        infoPo.setRoundIndex(container.getRoundIndex());
        infoPo.setStatus(container.getStatus());
        infoPo.setAddressSet(container.getAddressSet());
        return infoPo;
    }

    public static void copyFromBlockProtocolInfoPo(BlockProtocolInfoPo infoPo, ProtocolContainer container) {
        if (infoPo.getVersion() == container.getVersion()) {
            container.setStatus(infoPo.getStatus());
            container.setEffectiveHeight(infoPo.getEffectiveHeight());
            container.setRoundIndex(infoPo.getRoundIndex());
            container.setAddressSet(infoPo.getAddressSet());
            container.setCurrentDelay(infoPo.getCurrentDelay());
        } else {
            Log.error("-------------!!!!!!!!!!!!!!!!居然version不一样--------------");
            Log.error("-------------------infoPo.version = " + infoPo.getVersion());
            Log.error("-------------------container.version = " + container.getVersion());
        }

    }
}
