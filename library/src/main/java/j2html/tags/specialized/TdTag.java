package j2html.tags.specialized;

import j2html.tags.ContainerTag;
import j2html.tags.attributes.*;

public class TdTag extends ContainerTag<TdTag> 
implements IColspan<TdTag>,IHeaders<TdTag>,IRowspan<TdTag> {
public TdTag() {super("td");}
}
