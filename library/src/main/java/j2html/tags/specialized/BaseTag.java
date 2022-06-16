package j2html.tags.specialized;

import j2html.tags.EmptyTag;
import j2html.tags.attributes.*;

public class BaseTag extends EmptyTag<BaseTag> 
implements IHref<BaseTag>,ITarget<BaseTag> {
public BaseTag() {super("base");}
}
