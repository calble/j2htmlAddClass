package j2html.tags.specialized;

import j2html.tags.ContainerTag;
import j2html.tags.attributes.*;

public class BlockquoteTag extends ContainerTag<BlockquoteTag> 
implements ICite<BlockquoteTag> {
public BlockquoteTag() {super("blockquote");}
}
