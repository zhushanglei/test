tController
@RequestMapping("/wx/auth")
@Validated
public class WxAuthController {
    private static final Logger logger = LoggerFactory.getLogger(WxAuthController.class);

    @Autowired
    private IWechatUserService userService;

    @Autowired
    private WxMaService wxService;

//    @Autowired
  }
