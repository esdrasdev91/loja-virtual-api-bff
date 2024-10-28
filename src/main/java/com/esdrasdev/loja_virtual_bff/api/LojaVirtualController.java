package com.esdrasdev.loja_virtual_bff.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loja-virtual")
@RequiredArgsConstructor
@Tag(name = "loja-virtual-api")
public class LojaVirtualController {


}
